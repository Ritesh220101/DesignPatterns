package com.aurionpro.model;

public class OilChange extends CarDecorator{

	public OilChange(ICarService car) {
		super(car);
	}

	@Override
	public double getCost() {
		return 700+super.getCost();
	}

	@Override
	public String getServiceDetails() {
		// TODO Auto-generated method stub
		return "OilService\n"+super.getServiceDetails();
	}
	
}
