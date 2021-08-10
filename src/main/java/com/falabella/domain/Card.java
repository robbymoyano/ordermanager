package com.falabella.domain;

public class Card extends Payment {

    private String dni;
    private int instalmentType;
    private int expirationMonth;
    private int expirationYear;
    private long cardNumber;
    private Double amount;
    private int instalments;
    private Double instalmentAmount;
    private String cardType;
    private String cardGateway;
    private String bank;
    private String collector;
    private String currency;
    private int deferred;
    private Giftcard giftcard;
    private QuickPay quickPay;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getInstalmentType() {
        return instalmentType;
    }

    public void setInstalmentType(int instalmentType) {
        this.instalmentType = instalmentType;
    }

    public int getExpirationMonth() {
        return expirationMonth;
    }

    public void setExpirationMonth(int expirationMonth) {
        this.expirationMonth = expirationMonth;
    }

    public int getExpirationYear() {
        return expirationYear;
    }

    public void setExpirationYear(int expirationYear) {
        this.expirationYear = expirationYear;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public int getInstalments() {
        return instalments;
    }

    public void setInstalments(int instalments) {
        this.instalments = instalments;
    }

    public Double getInstalmentAmount() {
        return instalmentAmount;
    }

    public void setInstalmentAmount(Double instalmentAmount) {
        this.instalmentAmount = instalmentAmount;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getDeferred() {
        return deferred;
    }

    public void setDeferred(int deferred) {
        this.deferred = deferred;
    }

	public Giftcard getGiftcard() {
		return giftcard;
	}

	public void setGiftcard(Giftcard giftcard) {
		this.giftcard = giftcard;
	}

	public QuickPay getQuickPay() {
		return quickPay;
	}

	public void setQuickPay(QuickPay quickPay) {
		this.quickPay = quickPay;
	}

	public String getCardGateway() {
		return cardGateway;
	}

	public void setCardGateway(String cardGateway) {
		this.cardGateway = cardGateway;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getCollector() {
		return collector;
	}

	public void setCollector(String collector) {
		this.collector = collector;
	}

	
	
}
