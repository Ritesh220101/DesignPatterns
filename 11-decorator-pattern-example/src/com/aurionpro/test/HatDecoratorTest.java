package com.aurionpro.test;

import com.aurionpro.model.GoldenHat;
import com.aurionpro.model.PremiumHat;
import com.aurionpro.model.RibonnedHat;
import com.aurionpro.model.StandardHat;

public class HatDecoratorTest {

	public static void main(String[] args) {
		StandardHat standard = new StandardHat();
		GoldenHat golden = new GoldenHat(standard);
		RibonnedHat ribon = new RibonnedHat(golden);
		System.out.println(ribon.getName());
		System.out.println(ribon.getDescription());
		System.out.println(ribon.getPrice());
		
		System.out.println("------------------------");
		
		PremiumHat premium = new PremiumHat();
		RibonnedHat rib = new RibonnedHat(premium);
		System.out.println(rib.getName());
		System.out.println(rib.getDescription());
		System.out.println(rib.getPrice());
		
	}

}
