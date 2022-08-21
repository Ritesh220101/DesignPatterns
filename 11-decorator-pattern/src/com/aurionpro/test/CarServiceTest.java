package com.aurionpro.test;

import com.aurionpro.model.CarService;
import com.aurionpro.model.OilChange;
import com.aurionpro.model.PaintCar;
import com.aurionpro.model.WheelAlign;

public class CarServiceTest {
	public static void main(String[] args) {
		CarService car = new CarService();
		OilChange oilChange = new OilChange(car);
		WheelAlign wheelAlign = new WheelAlign(oilChange);
		PaintCar paintCar = new PaintCar(wheelAlign);
		System.out.println("Total cost of the services: "+paintCar.getCost());
		
		System.out.println("--------------------------------------");
		
		System.out.println("Description of the services: ");
		System.out.println(paintCar.getServiceDetails());
	}
}
