package com.falabella.domain.response;

import java.util.List;

import com.falabella.domain.Tenant;
import com.falabella.domain.Terminal;

public class ResponseTerminal {

	Tenant tenant;
	List<Terminal> terminales;
	public Tenant getTenant() {
		return tenant;
	}
	public void setTenant(Tenant tenant) {
		this.tenant = tenant;
	}
	public List<Terminal> getTerminales() {
		return terminales;
	}
	public void setTerminales(List<Terminal> terminales) {
		this.terminales = terminales;
	}
	
	
}
