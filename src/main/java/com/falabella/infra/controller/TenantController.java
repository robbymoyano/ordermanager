package com.falabella.infra.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.falabella.domain.Message;
import com.falabella.domain.Tenant;
import com.falabella.domain.response.ResponsePaymentMethod;
import com.falabella.domain.response.ResponseTerminal;
import com.falabella.usecase.TenantService;

@RestController
public class TenantController {

	@Autowired
	private TenantService service;

	@GetMapping(value = "/tenants", produces = { "application/json" })
	public ResponseEntity<Object> getAllTenasts() {
		try {
			List<Tenant> tenants = service.getAllTenants();
			return new ResponseEntity<Object>(tenants, HttpStatus.OK);
		} catch (Exception e) {

			Message message = new Message();
			message.setCode(2);
			message.setMessage(e.getMessage());
			return new ResponseEntity<Object>(message, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
	
	
	@GetMapping(value = "/tenants/{id}/terminals", produces = { "application/json" })
	public ResponseEntity<Object> getTerminals(@PathVariable("id") int idTenant) {
		try {
			ResponseTerminal tenants = service.getTerminales(idTenant);
			return new ResponseEntity<Object>(tenants, HttpStatus.OK);
		} catch (Exception e) {

			Message message = new Message();
			message.setCode(2);
			message.setMessage(e.getMessage());
			return new ResponseEntity<Object>(message, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
	
	@GetMapping(value = "/tenants/{id}/payment", produces = { "application/json" })
	public ResponseEntity<Object> getPayment(@PathVariable("id") int idTenant) {
		try {
			ResponsePaymentMethod tenants = service.getMethodPayment(idTenant);
			return new ResponseEntity<Object>(tenants, HttpStatus.OK);
		} catch (Exception e) {

			Message message = new Message();
			message.setCode(2);
			message.setMessage(e.getMessage());
			return new ResponseEntity<Object>(message, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
}
