package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<IItem> items;

	public ShoppingCart() {
		this.items = new ArrayList<>();
	}

	public List<IItem> getItems() {
		return items;
	}

	public void addItemToCart(IItem item) {
		items.add(item);
	}

	public double getTotalCartPrice() {
		double sum = 0;
		for (IItem i : items)
			sum += i.getPrice();

		return sum;
	}

}
