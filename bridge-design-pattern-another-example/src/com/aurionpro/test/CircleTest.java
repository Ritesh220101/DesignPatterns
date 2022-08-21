package com.aurionpro.test;

import com.aurionpro.model.BlueColor;

import com.aurionpro.model.Circle;
import com.aurionpro.model.RedColor;
import com.aurionpro.model.Square;

public class CircleTest {

	public static void main(String[] args) {
		Circle c1 = new Circle(new RedColor());
		System.out.println(c1.drawing());
		
		Circle c2 = new Circle(new BlueColor());
		System.out.println(c2.drawing());
		
		Square s1 = new Square(new RedColor());
		System.out.println(s1.drawing());
	
	}

}
