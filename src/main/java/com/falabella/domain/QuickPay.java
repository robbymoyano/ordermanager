package com.falabella.domain;

public class QuickPay {

	private String originalQpTrxId;
	private String logicalTrxId;
	private String dispatchType;
	private String codeType;
	private String merchTxnId;
	/*
	 * Datos que se deben completar para enviar a los destinatarios
	 */

	private String qpTrxId;
	private String commerceCode;
	private String sendTime;
	private String receptionTime;

	public String getOriginalQpTrxId() {
		return originalQpTrxId;
	}

	public void setOriginalQpTrxId(String originalQpTrxId) {
		this.originalQpTrxId = originalQpTrxId;
	}

	public String getLogicalTrxId() {
		return logicalTrxId;
	}

	public void setLogicalTrxId(String logicalTrxId) {
		this.logicalTrxId = logicalTrxId;
	}

	public String getDispatchType() {
		return dispatchType;
	}

	public void setDispatchType(String dispatchType) {
		this.dispatchType = dispatchType;
	}

	public String getQpTrxId() {
		return qpTrxId;
	}

	public void setQpTrxId(String qpTrxId) {
		this.qpTrxId = qpTrxId;
	}

	public String getCommerceCode() {
		return commerceCode;
	}

	public void setCommerceCode(String commerceCode) {
		this.commerceCode = commerceCode;
	}

	public String getSendTime() {
		return sendTime;
	}

	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}

	public String getReceptionTime() {
		return receptionTime;
	}

	public void setReceptionTime(String receptionTime) {
		this.receptionTime = receptionTime;
	}

	public String getCodeType() {
		return codeType;
	}

	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}

	public String getMerchTxnId() {
		return merchTxnId;
	}

	public void setMerchTxnId(String merchTxnId) {
		this.merchTxnId = merchTxnId;
	}

}
