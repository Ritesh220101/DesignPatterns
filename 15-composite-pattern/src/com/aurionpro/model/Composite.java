package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class Composite implements IComponent {
	String name;
	public Composite(String name) {
		super();
		this.name = name;
	}
	List<IComponent> components=new ArrayList<IComponent>();
	public void addComponent(IComponent com) {
		components.add(com);
	}
	@Override
	public void showNamePrice() {
		System.out.println(name);
		for (IComponent c:components) {
			c.showNamePrice();
		}

	}

}
//Composite design pattern will have a tree structure which have composite and leaf objects
//if you perform certain operation on leaf object same operations is to be performed on composite objects

