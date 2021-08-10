package com.falabella.domain;

public class Tenant {

	int id;
	String codCountry;
	String codCommerce;
	String name;
	String timeZone;
	boolean active;
	String created;
	String horaOff;
	String horaOn;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCodCountry() {
		return codCountry;
	}
	public void setCodCountry(String codCountry) {
		this.codCountry = codCountry;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTimeZone() {
		return timeZone;
	}
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public String getCodCommerce() {
		return codCommerce;
	}
	public void setCodCommerce(String codCommerce) {
		this.codCommerce = codCommerce;
	}
	public String getHoraOff() {
		return horaOff;
	}
	public void setHoraOff(String horaOff) {
		this.horaOff = horaOff;
	}
	public String getHoraOn() {
		return horaOn;
	}
	public void setHoraOn(String horaOn) {
		this.horaOn = horaOn;
	}
	@Override
	public String toString() {
		return "Tenant [id=" + id + ", codCountry=" + codCountry + ", codCommerce=" + codCommerce + ", name=" + name
				+ ", timeZone=" + timeZone + ", active=" + active + ", created=" + created + ", horaOff=" + horaOff
				+ ", horaOn=" + horaOn + "]";
	}
	
	
}
