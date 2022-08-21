package com.aurionpro.model;

public class Biscuit implements IItem {
	private String name;
	private double price;
	
	
	public Biscuit(String name, double price) {
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
