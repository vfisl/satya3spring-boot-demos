package com.productapp.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class Product {
	@Size(min=5,max=15)
	private String productName;
	@Min(101)
	@Max(10001)
	private Integer productId;
	@Min(1)
	private double ratings;
	private double price;
	private String brand;
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public double getRatings() {
		return ratings;
	}
	public void setRatings(double ratings) {
		this.ratings = ratings;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productId=" + productId + ", ratings=" + ratings + ", price="
				+ price + ", brand=" + brand + "]";
	}
	
	

}
