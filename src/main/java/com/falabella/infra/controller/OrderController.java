package com.falabella.infra.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.falabella.domain.Message;
import com.falabella.domain.exception.OrderException;
import com.falabella.domain.request.OrderRequest;
import com.falabella.usecase.ValidacionesService;
import com.falabella.usecase.util.Conversiones;

@RestController
public class OrderController {

	@Autowired
	ValidacionesService v;
	private final Logger log = LoggerFactory.getLogger(OrderController.class);

	@PostMapping("/orders")
	public ResponseEntity<Message> ingresarEstudiante(@RequestBody OrderRequest request,
			@RequestHeader(value = "X-country", required = false) String country,
			@RequestHeader(value = "X-commerce", required = false) String commerce) {
		log.info(Conversiones.serializarObjeto(request));

		if (country == null)
			return badRequest("X-country no puede ser nulo");
		if (commerce == null)
			return badRequest("X-commerce no puede ser nulo");
		
		try {
			v.validarOrden(request, country, commerce);
		} catch (OrderException e) {
			return new ResponseEntity<Message>(e.getMessageDomain(), HttpStatus.BAD_REQUEST);
		}
		Message message = new Message();
		message.setCode(200);
		message.setMessage("ok");
		return new ResponseEntity<Message>(message, HttpStatus.OK);
	}

	public ResponseEntity<Message> badRequest(String msg) {
		Message message = new Message();
		message.setCode(400);
		message.setMessage(msg);
		return new ResponseEntity<Message>(message, HttpStatus.BAD_REQUEST);
	}
}
