package com.aurionpro.model;

public class Maruti implements IAutomobile {

	@Override
	public void start() {
		System.out.println("Maruti has started");
	}

	@Override
	public void stop() {
		System.out.println("Maruti has stopped");
	}

}
