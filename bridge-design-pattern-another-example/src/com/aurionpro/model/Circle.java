package com.aurionpro.model;

public class Circle extends Shape {

	public Circle(IDraw draw) {
		super(draw);
	}

	@Override
	public String drawing() {
		return "Circle is"+draw.fill();
	}
	
}
