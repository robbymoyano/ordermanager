package com.falabella.domain.exception;

import com.falabella.domain.Message;

public class OrderException extends Exception {

	private static final long serialVersionUID = -7419123546658589752L;

	private Message message;

	public OrderException(String msg, int code) {
		super(msg);
		message = new Message();
		message.setCode(code);
		message.setMessage(msg);
	}

	public Message getMessageDomain() {
		return message;
	}

}
