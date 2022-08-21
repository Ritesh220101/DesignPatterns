package com.aurionpro.model;

public class BMWFactory implements IAutomobileFactory {
	static BMWFactory instance;
	
	private BMWFactory() {
	}
	
	public static IAutomobileFactory getInstance() {
		if (instance == null) {
			instance = new BMWFactory();
		}
		return instance;
	}
	
	@Override
	public IAutomobile makeAutomobile() {
			return new BMW();
	}

}
