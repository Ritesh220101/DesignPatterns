package com.aurionpro.model;

public class PaintCar extends CarDecorator{

	public PaintCar(ICarService car) {
		super(car);
	}

	@Override
	public double getCost() {
		return 1000+super.getCost();
	}
	
	@Override
	public String getServiceDetails() {
		// TODO Auto-generated method stub
		return "PaintCar\n"+super.getServiceDetails();
	}
}
