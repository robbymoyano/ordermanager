package com.falabella.domain.response;

import java.util.List;

import com.falabella.domain.PaymentMethod;
import com.falabella.domain.Tenant;

public class ResponsePaymentMethod {
	Tenant tenant;
	List<PaymentMethod> paymentMethod;
	public Tenant getTenant() {
		return tenant;
	}
	public void setTenant(Tenant tenant) {
		this.tenant = tenant;
	}
	public List<PaymentMethod> getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(List<PaymentMethod> paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

}
