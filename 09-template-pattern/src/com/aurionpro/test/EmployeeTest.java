package com.aurionpro.test;

import com.aurionpro.model.Accountant;
import com.aurionpro.model.Developer;
import com.aurionpro.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee dev = new Developer();
		dev.workRoutine();
		
		System.out.println("--------------------------------------");
		
		Employee acc = new Accountant();
		acc.workRoutine();

	}

}
