package com.aurionpro.model;

public class WheelAlign extends CarDecorator{

	public WheelAlign(ICarService car) {
		super(car);
	}

	@Override
	public double getCost() {
		return 900+super.getCost();
	}
	
	@Override
	public String getServiceDetails() {
		// TODO Auto-generated method stub
		return "WheelAlign\n"+super.getServiceDetails();
	}
}
