package com.aurionpro.model;

public class Pepsi implements IItem {
	private String name;
	private double price;
	
	public Pepsi(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public double getPrice() {
		return price;
	}

}
