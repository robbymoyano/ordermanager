package com.falabella.domain;

public class PaymentMethod {

	int codPayment;
	String description;
	boolean active;
	public int getCodPayment() {
		return codPayment;
	}
	public void setCodPayment(int codPayment) {
		this.codPayment = codPayment;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	@Override
	public String toString() {
		return "PaymentMethod [codPayment=" + codPayment + ", description=" + description + ", active=" + active + "]";
	}
	
	
}
