package com.aurionpro.test;
import com.aurionpro.model.Org;

public class OrgTest {

	public static void main(String[] args) {
		System.out.println("Values present in Enum:");
		for (Org org : Org.values())
			System.out.println(org);

		System.out.println("-----------------------------");

		System.out.println("Index of FPX is: " + Org.valueOf("FPX").ordinal());

		System.out.println("-----------------------------");
		Org.print();
		
	}

}
