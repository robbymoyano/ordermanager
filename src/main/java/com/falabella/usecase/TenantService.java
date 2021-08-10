package com.falabella.usecase;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.falabella.domain.Tenant;
import com.falabella.domain.Terminal;
import com.falabella.domain.repository.PaymentMethodRepository;
import com.falabella.domain.repository.TenantRepository;
import com.falabella.domain.repository.TerminalsRepository;
import com.falabella.domain.response.ResponsePaymentMethod;
import com.falabella.domain.response.ResponseTerminal;

@Service
public class TenantService {

	@Autowired
	private TenantRepository repo;
	
	@Autowired
	private TerminalsRepository terRepo;
	
	@Autowired
	PaymentMethodRepository mdpRepo;
	
	public List<Tenant> getAllTenants() throws Exception{
		List<Tenant> lista=repo.getAllTenants();
		for (Tenant t: lista) {
			System.out.println(t.toString());
		}
		return lista;
	}
	
	public ResponseTerminal getTerminales(int idTenant) throws Exception{
		ResponseTerminal response = new ResponseTerminal();
		response.setTenant(repo.getTenantById(idTenant));
		List<Terminal> lista= repo.getTerminalsByTenant(idTenant);
		for (int i=0; i<lista.size(); i++) {
			List<Integer> listPaymentMethod= terRepo.getDocumentsByTerminal(lista.get(i).getId());
			lista.get(i).setPaymentMethod(listPaymentMethod);
		}
		response.setTerminales(lista);
		return response;
	}
	
	public ResponsePaymentMethod getMethodPayment(int idTenant) throws Exception{
		ResponsePaymentMethod response = new ResponsePaymentMethod();
		response.setTenant(repo.getTenantById(idTenant));
		response.setPaymentMethod(mdpRepo.getPaymentMethodByTenant(idTenant));
		return response;
	}
}
