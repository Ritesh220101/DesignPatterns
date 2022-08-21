package com.aurionpro.test;

import com.aurionpro.model.Developer;
import com.aurionpro.model.Manager;

public class PrototypeTest {

	public static void main(String[] args) {
		Developer dev = new Developer("ritz", 101, 30000);
		Developer dev1 = (Developer) dev.makeClone();
		
		dev.setId(102);
		System.out.println(dev);
//		System.out.println(dev.hashCode());
		System.out.println(dev1);
//		System.out.println(dev1.hashCode());
		System.out.println("--------------------------------------------------");
		Manager man = new Manager("zitr", 201, 50000);
		Manager man1 = (Manager) man.makeClone();
		
		System.out.println(man);
		System.out.println(man1);
		System.out.println("--------------------------------------------------");

//		man1.setName("jtipt");
//		Manager man2 = (Manager) man1.makeClone();
//		System.out.println(man1);
//		System.out.println(man2);
	}

}
