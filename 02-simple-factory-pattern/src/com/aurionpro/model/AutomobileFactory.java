package com.aurionpro.model;

public class AutomobileFactory {
	public IAutomobile makeAutomobile(AutoType auto) {
		if (auto.equals(AutoType.BMW))
			return new BMW();
		if (auto.equals(AutoType.TESLA))
			return new Tesla();
		if (auto.equals(AutoType.MARUTI))
			return new Maruti();

		return null;
	}
}
