package com.aurionpro.test;

import java.util.List;

import com.aurionpro.model.Biscuit;
import com.aurionpro.model.Hat;
import com.aurionpro.model.HatAdapter;
import com.aurionpro.model.IItem;
import com.aurionpro.model.Pepsi;
import com.aurionpro.model.ShoppingCart;

public class ShoppingCartTest {

	public static void main(String[] args) {
		HatAdapter hatAdapter = new HatAdapter(new Hat("normal hat", "normal but big hat", 500, 0.5));

		Biscuit b = new Biscuit("tiger", 50);
		Pepsi p = new Pepsi("pepsi", 100);
		ShoppingCart sc = new ShoppingCart();

		sc.addItemToCart(b);
		sc.addItemToCart(p);
		sc.addItemToCart(hatAdapter);

		displayCartItems(sc);
		System.out.println("Total cart price: "+sc.getTotalCartPrice());

	}

	private static void displayCartItems(ShoppingCart sc) {
		List<IItem> cartItems = sc.getItems();

		for (IItem i : cartItems) {
			System.out.println("Item Name: " + i.getName());
			System.out.println("Item price: " + i.getPrice());
			System.out.println("------------------------------");
		}

	}

}
