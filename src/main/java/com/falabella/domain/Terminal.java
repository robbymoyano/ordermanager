package com.falabella.domain;

import java.util.List;

public class Terminal {

	int id;
	int codStore;
	int codTer;
	boolean active;
	String codStatus;
	List<Integer> paymentMethod;
	
	public int getCodStore() {
		return codStore;
	}
	public void setCodStore(int codStore) {
		this.codStore = codStore;
	}
	public int getCodTer() {
		return codTer;
	}
	public void setCodTer(int codTer) {
		this.codTer = codTer;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	public String getCodStatus() {
		return codStatus;
	}
	public void setCodStatus(String codStatus) {
		this.codStatus = codStatus;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Terminal [id=" + id + ", codStore=" + codStore + ", codTer=" + codTer + ", active=" + active
				+ ", codStatus=" + codStatus + "]";
	}
	public List<Integer> getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(List<Integer> paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	
	
}
