package com.falabella.domain;

import java.util.List;

public class CreditNote {

	private long codAuthorized;
	private String sellerCode;
	private String sellerName;
	private Double discount;
	private Double amount;
	private String dniType;
	private String dni;
	
	private String client;
	private String emailClient;
	private String bridalCode;
	    
	private String activity;
	private String typification;
	private String codSiebel;
	private String typeF12;
	
	private Double totalTaxAmount;
	private PreviousOrder previousOrder;
	private List<Card> listPayment;
    private long idNote;


    private int local;
    private int terminal;
    private long secuencia;
    private String date;
    private String channel;
    
	public long getCodAuthorized() {
		return codAuthorized;
	}

	public void setCodAuthorized(long codAuthorized) {
		this.codAuthorized = codAuthorized;
	}

	public String getSellerCode() {
		return sellerCode;
	}

	public void setSellerCode(String sellerCode) {
		this.sellerCode = sellerCode;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getDniType() {
		return dniType;
	}

	public void setDniType(String dniType) {
		this.dniType = dniType;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Double getTotalTaxAmount() {
		return totalTaxAmount;
	}

	public void setTotalTaxAmount(Double totalTaxAmount) {
		this.totalTaxAmount = totalTaxAmount;
	}

	public List<Card> getListPayment() {
		return listPayment;
	}

	public void setListPayment(List<Card> listPayment) {
		this.listPayment = listPayment;
	}

	public PreviousOrder getPreviousOrder() {
		return previousOrder;
	}

	public void setPreviousOrder(PreviousOrder previousOrder) {
		this.previousOrder = previousOrder;
	}

	public long getIdNote() {
		return idNote;
	}

	public void setIdNote(long idNote) {
		this.idNote = idNote;
	}

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

	public long getSecuencia() {
		return secuencia;
	}

	public void setSecuencia(long secuencia) {
		this.secuencia = secuencia;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public String getTypification() {
		return typification;
	}

	public void setTypification(String typification) {
		this.typification = typification;
	}

	public String getCodSiebel() {
		return codSiebel;
	}

	public void setCodSiebel(String codSiebel) {
		this.codSiebel = codSiebel;
	}

	public String getTypeF12() {
		return typeF12;
	}

	public void setTypeF12(String typeF12) {
		this.typeF12 = typeF12;
	}

	public String getEmailClient() {
		return emailClient;
	}

	public void setEmailClient(String emailClient) {
		this.emailClient = emailClient;
	}

	public String getBridalCode() {
		return bridalCode;
	}

	public void setBridalCode(String bridalCode) {
		this.bridalCode = bridalCode;
	}

}
