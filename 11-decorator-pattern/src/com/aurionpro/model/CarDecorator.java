package com.aurionpro.model;

public abstract class CarDecorator implements ICarService {
	ICarService car;
	
	public CarDecorator(ICarService car) {
		super();
		this.car = car;
	}

	@Override
	public double getCost() {
		return car.getCost();
	}

	@Override
	public String getServiceDetails() {
		return car.getServiceDetails();
	}
	
}
