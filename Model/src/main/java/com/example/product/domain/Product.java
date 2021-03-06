package com.example.product.domain;

import org.springframework.stereotype.Component;

@Component
public class Product {
	private long id;
	private String sku;
	private String description;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Product(long id, String sku, String description) {
		super();
		this.id = id;
		this.sku = sku;
		this.description = description;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", sku=" + sku + ", description=" + description + "]";
	}
	
	
}
