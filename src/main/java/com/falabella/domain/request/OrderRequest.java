package com.falabella.domain.request;

import java.util.List;

import com.falabella.domain.Order;
import com.falabella.domain.Product;

public class OrderRequest {
	private Order order;
	private List<Product> productList;

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
}
