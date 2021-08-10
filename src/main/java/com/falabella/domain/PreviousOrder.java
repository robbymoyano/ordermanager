package com.falabella.domain;

public class PreviousOrder {

	private int local;
	private int terminal;
	private int secuencia;
	private String date;
	private long orderNumber;
	private String sellerCode;
	private long orderFolio;

	public int getLocal() {
		return local;
	}

	public void setLocal(int local) {
		this.local = local;
	}

	public int getTerminal() {
		return terminal;
	}

	public void setTerminal(int terminal) {
		this.terminal = terminal;
	}

	public int getSecuencia() {
		return secuencia;
	}

	public void setSecuencia(int secuencia) {
		this.secuencia = secuencia;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getSellerCode() {
		return sellerCode;
	}

	public void setSellerCode(String sellerCode) {
		this.sellerCode = sellerCode;
	}

	public long getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(long orderNumber) {
		this.orderNumber = orderNumber;
	}

	public long getOrderFolio() {
		return orderFolio;
	}

	public void setOrderFolio(long orderFolio) {
		this.orderFolio = orderFolio;
	}
}
