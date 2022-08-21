package com.aurionpro.test;

import com.aurionpro.model.AutoType;
import com.aurionpro.model.AutomobileFactory;
import com.aurionpro.model.IAutomobile;

public class AutomobileFactoryTest {

	public static void main(String[] args) {
		AutomobileFactory amf = new AutomobileFactory();
		IAutomobile bmw = amf.makeAutomobile(AutoType.BMW);
		bmw.start();
		bmw.stop();

		IAutomobile tesla = amf.makeAutomobile(AutoType.TESLA);
		tesla.start();
		tesla.stop();

		IAutomobile maruti = amf.makeAutomobile(AutoType.MARUTI);
		maruti.start();
		maruti.stop();
	}

}
