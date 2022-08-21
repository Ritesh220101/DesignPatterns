package com.aurionpro.test;

import com.aurionpro.model.Consultant;

import com.aurionpro.model.Employee;
import com.aurionpro.model.SeniorConsultant;
import com.aurionpro.model.TechLead;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp = new Employee(101, "ritz", new Consultant());
		System.out.println(emp.getdescription());
		System.out.println(emp.getresponsibility());
		
		System.out.println("--------------------------------");
		
		emp.promote(new SeniorConsultant());
		System.out.println(emp.getdescription());
		System.out.println(emp.getresponsibility());
		
		System.out.println("--------------------------------");
		
		emp.promote(new TechLead());
		System.out.println(emp.getdescription());
		System.out.println(emp.getresponsibility());
	}

}
