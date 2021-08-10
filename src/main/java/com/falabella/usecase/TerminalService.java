package com.falabella.usecase;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.falabella.domain.Terminal;
import com.falabella.domain.exception.OrderException;
import com.falabella.domain.repository.TerminalsRepository;



@Service
public class TerminalService {
	
	@Autowired
	private TerminalsRepository repoTerminal;
	
	private Logger log = LoggerFactory.getLogger(TerminalService.class);
	public Terminal getTerminal(int tenantId, int doc) throws OrderException {
		// obtengo el hashmap con todos los terminales, la config se ejecuta
		// solo al inicio
		//Map<String, List<MapTerminal>> terminales = this.getHashMapTerminales();
		log.info("Consultado terminales tenantId: {}, doc: {}", tenantId, doc);
		List<Terminal> lista = repoTerminal.getTerminalsByTenantAndDocument(tenantId, doc);
		if (lista.isEmpty())
			throw new OrderException("Tenant sin terminales disponibles", 1);
		
		for(Terminal t: lista) {
			log.info("TERMINALES DISPONIBLES");
			log.info("{}",t.toString());
		}
		// me quedo solo con los terminales asociados a la trx

		
	
			// se calcula el index aleatorio
			int valorEntero = (int) (Math.random() * lista.size());

			// retorno el terminal seleccionado aleatoriamente
			Terminal terminal = lista.get(valorEntero);
			log.info("Terminal asignado {}", terminal.toString());
			// si la terminal está cerrada se debe aperturar
			if (terminal.getCodStatus().equals("A"))
				log.info("El terminal está abierto");
			else {
				log.info("El terminal está cerrado");
				//aperturarTerminal(terminal.getLocal(), terminal.getTerminal());
				//mapper.cambiarEstadoTerminal(terminal.getLocal(), terminal.getTerminal());
			}

			return terminal;
		

	}
	
	

}
