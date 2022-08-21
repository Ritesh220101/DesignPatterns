package com.aurionpro.model;

public class MarutiFactory implements IAutomobileFactory {
	static MarutiFactory instance;
	
	private MarutiFactory() {
	}
	
	public static IAutomobileFactory getInstance() {
		if (instance == null) {
			instance = new MarutiFactory();
		}
		return instance;
	}
	
	@Override
	public IAutomobile makeAutomobile() {
			return new Maruti();
	}

}
