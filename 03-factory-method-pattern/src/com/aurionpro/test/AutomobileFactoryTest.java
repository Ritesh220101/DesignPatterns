package com.aurionpro.test;

import com.aurionpro.model.BMWFactory;
import com.aurionpro.model.IAutomobile;
import com.aurionpro.model.IAutomobileFactory;
import com.aurionpro.model.MarutiFactory;
import com.aurionpro.model.TeslaFactory;

public class AutomobileFactoryTest {

	public static void main(String[] args) {
		IAutomobileFactory factory = BMWFactory.getInstance();
		IAutomobile bmw = factory.makeAutomobile();
		bmw.start();
		bmw.stop();
		
		IAutomobileFactory factory1 = TeslaFactory.getInstance();
		IAutomobile tesla = factory1.makeAutomobile();
		tesla.start();
		tesla.stop();
		
		IAutomobileFactory factory2 = MarutiFactory.getInstance();
		IAutomobile maruti = factory2.makeAutomobile();
		maruti.start();
		maruti.stop();
	}

}
