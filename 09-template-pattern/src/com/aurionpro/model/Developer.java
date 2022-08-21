package com.aurionpro.model;

public class Developer extends Employee{
	
	@Override
	void login() {
		System.out.println("Developer logged in.");
		
	}

	@Override
	void doWork() {
		System.out.println("Developer doing code.");
		
	}

	@Override
	void takeBreak() {
		System.out.println("Developer is eating his lunchbox");
		
	}

	@Override
	void logOut() {
		System.out.println("Developer logged out and chilling.");
		
	}

}
