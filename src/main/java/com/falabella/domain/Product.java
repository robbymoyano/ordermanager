package com.falabella.domain;


public class Product {
    
	private String universalProductCode;
    private String discountCode;
    private Double discountAmount;
    private int unit;
    private String category;
    private Double price;
    private String description;
    private String brandCode;
    private String taxCode;
    private Double taxAmount;
    private Double taxPrevAmount;
    private boolean	isSeller;
    private Double arancel;
    private Double shipping;
    
    private Double taxPercentage;
    private Double taxPrevPercentage;
    private String taxString;
    private long discountApportionment;

    private Double net;
    
    public String getUniversalProductCode() {
		return universalProductCode;
	}

	public void setUniversalProductCode(String universalProductCode) {
		this.universalProductCode = universalProductCode;
	}

    public String getDiscountCode() {
        return discountCode;
    }

    public void setDiscountCode(String discountCode) {
        this.discountCode = discountCode;
    }

    public Double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

	public String getBrandCode() {
		return brandCode;
	}

	public void setBrandCode(String brandCode) {
		this.brandCode = brandCode;
	}

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public Double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public Double getTaxPrevAmount() {
        return taxPrevAmount;
    }

    public void setTaxPrevAmount(Double taxPrevAmount) {
        this.taxPrevAmount = taxPrevAmount;
    }

    public Double getTaxPercentage() {
		return taxPercentage;
	}

	public void setTaxPercentage(Double taxPercentage) {
		this.taxPercentage = taxPercentage;
	}

    public Double getTaxPrevPercentage() {
        return taxPrevPercentage;
    }

    public void setTaxPrevPercentage(Double taxPrevPercentage) {
        this.taxPrevPercentage = taxPrevPercentage;
    }

    public String getTaxString() {
		return taxString;
	}

	public void setTaxString(String taxString) {
		this.taxString = taxString;
	}

	public boolean getIsSeller() {
		return isSeller;
	}

	public void setIsSeller(boolean isSeller) {
		this.isSeller = isSeller;
	}

	public Double getArancel() {
		return arancel;
	}

	public void setArancel(Double arancel) {
		this.arancel = arancel;
	}

	public Double getShipping() {
		return shipping;
	}

	public void setShipping(Double shipping) {
		this.shipping = shipping;
	}

	public long getDiscountApportionment() {
		return discountApportionment;
	}

	public void setDiscountApportionment(long discountApportionment) {
		this.discountApportionment = discountApportionment;

	}

    public Double getNet() {
        return net;
    }

    public void setNet(Double net) {
        this.net = net;
    }
}
