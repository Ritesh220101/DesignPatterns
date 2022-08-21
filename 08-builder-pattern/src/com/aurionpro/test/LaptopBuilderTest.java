package com.aurionpro.test;

import com.aurionpro.model.Laptop;
import com.aurionpro.model.LaptopBuilder;

public class LaptopBuilderTest {

	public static void main(String[] args) {
		Laptop laptop = new LaptopBuilder().hasTouchScreen(true).addHdd("1 TB Seagate").addRam("32 GB HyperX").addKeyboard("Logitech").addMouse("Razer Viper V2").getLaptop();
		System.out.println(laptop);
	}

}
