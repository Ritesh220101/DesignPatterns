package com.aurionpro.test;

import com.aurionpro.model.Atc;
import com.aurionpro.model.Flight;
import com.aurionpro.model.IAtc;
import com.aurionpro.model.Runway;

public class AtcTest {
	public static void main(String[] args) {

		Atc atcMediator = new Atc();
		Runway runway = new Runway(atcMediator, "runway");

		Runway runway44 = new Runway(atcMediator, "runway44");
		Flight flight101 = new Flight(atcMediator, "flight 101 ");

		Flight flight102 = new Flight(atcMediator, " flight 102");


		flight101.readyToLand();
		System.out.println(flight101);
		System.out.println(runway);
		System.out.println();
		System.out.println();
		
		
		runway.land();
		System.out.println(runway);
		
		System.out.println();
		
		
		flight101.land();
		System.out.println(flight101);
		System.out.println(runway);
		
		System.out.println();		
		System.out.println();
		
		
		
		flight101.parked();
		System.out.println(flight101);
		System.out.println(runway);
		

		
	}

}
