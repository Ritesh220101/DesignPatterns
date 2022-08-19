package com.aurionpro.model;

public class Leaf implements IComponent {
	int price;
	String name;
	
	public Leaf(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}

	@Override
	public void showNamePrice() {
		System.out.println(name +" : " +price);

	}

}
