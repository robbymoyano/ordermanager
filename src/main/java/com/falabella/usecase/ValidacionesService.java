package com.falabella.usecase;

import java.time.Instant;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.falabella.domain.PaymentMethod;
import com.falabella.domain.Tenant;
import com.falabella.domain.Terminal;
import com.falabella.domain.exception.OrderException;
import com.falabella.domain.repository.PaymentMethodRepository;
import com.falabella.domain.repository.SequenceRepository;
import com.falabella.domain.repository.TenantRepository;
import com.falabella.domain.repository.TerminalsRepository;
import com.falabella.domain.request.OrderRequest;
import com.falabella.usecase.util.CierreUtil;

@Service
public class ValidacionesService {
	private final Logger log = LoggerFactory.getLogger(ValidacionesService.class);

	@Autowired
	TenantRepository repo;
	
	@Autowired
	TerminalsRepository repoTerminal;
	
	@Autowired
	TerminalService terminal;
	
	@Autowired
	SequenceRepository seqRepo;
	
	@Autowired
	PaymentMethodRepository mdpRepo;

	public void validarOrden(OrderRequest order, String country, String commerce) throws OrderException {

		Tenant tenant = repo.getTenantByCountryCommerce(country, commerce);

		if (tenant == null) {
			log.error("tenant no existe");
			throw new OrderException("Tenant " + country + "/" + commerce + " no existe", 1);
		}

		log.info("{}", tenant.toString());
		if (!tenant.isActive()) {
			log.error("tenant no activo");
			throw new OrderException("Tenant " + country + "/" + commerce + " no está habilitado", 1);
		}
		
		// calculo si tengo terminales disponibles
		// tambien se debe consultar por el tipo de documento
		
		//valido si puedo procesar dicho mdp
		
		Map<Integer, String> hashMapMdp = getHashMapMdp(tenant.getId());
		//por cada medio de pago valido si se puede procesar
		for(int i=0; i<order.getOrder().getListPayment().size();i++)
		{
			int mdp = order.getOrder().getListPayment().get(i).getMethod();
			if(hashMapMdp.get(mdp)==null)
				throw new OrderException("Medio de pago "+ mdp + "no soportado", 1);
			
		}
		
		Terminal t = terminal.getTerminal(tenant.getId(), 1);
		int store=t.getCodStore();
		int ter=t.getCodTer();
		log.info("Asignado: local {}, terminal{}", store, ter);
		long seq= seqRepo.getSequenceTerminal(t.getId()).getCurValue();
		log.info("Secuencia asignada: {}", seq);
		
		// ahora lo oc de envia por el bus de datos
		
		// valido por la hora si se retrasa o no
		boolean procesar = CierreUtil.evaluarProcesarOrden(Calendar.getInstance().getTime(), tenant.getHoraOn(), tenant.getHoraOff(), tenant.getTimeZone());
		log.info("procesar: {}", procesar);
		if(!procesar) {
			Instant instant= CierreUtil.calculaFechaInstant(tenant.getHoraOn(), tenant.getTimeZone());
			log.info("{}", instant);
		}

	}
	
	
	
	private Map<Integer, String> getHashMapMdp(int tenantId) throws OrderException {

		List<PaymentMethod> codigos;
		try {
			codigos = mdpRepo.getPaymentMethodByTenantActive(tenantId);
			HashMap<Integer, String> hash = new HashMap<>();
			for (int i = 0; i < codigos.size(); i++) {
				hash.put(codigos.get(i).getCodPayment(), codigos.get(i).getDescription());
			}
			log.info("Codigos MDP cargado OK");
			return hash;
		} catch (Exception e) {
			log.error("{}", e.getMessage());
			throw new OrderException("Error al cargar los codigos MDP", 500);
		}
	}
}
