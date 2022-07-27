package com.CollectionFramework;

public class Phone {
	private int price;
	private String model;
	private String name;
	
	public Phone(int price, String model, String name) {
		super();
		this.price = price;
		this.model = model;
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Phone [price=" + price + ", model=" + model + ", name=" + name + "]";
	}
}
