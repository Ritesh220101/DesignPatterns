package com.aurionpro.model;

public class TeslaFactory implements IAutomobileFactory {
	static TeslaFactory tesla;
	
	private TeslaFactory() {
	}
	
	public static IAutomobileFactory getInstance() {
		if (tesla == null) {
			tesla = new TeslaFactory();
		}
		return tesla;
	}
	
	@Override
	public IAutomobile makeAutomobile() {
			return new Tesla();
	}

}
