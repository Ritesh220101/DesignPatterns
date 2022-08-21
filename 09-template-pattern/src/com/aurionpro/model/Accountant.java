package com.aurionpro.model;

public class Accountant extends Employee{

	@Override
	void login() {
		System.out.println("Accountant logged in.");
		
	}

	@Override
	void doWork() {
		System.out.println("Accountant doing some random work.");
		
	}

	@Override
	void takeBreak() {
		System.out.println("Accountant is eating his lunchbox");
		
	}

	@Override
	void logOut() {
		System.out.println("Accountant logged out and chilling.");
		
	}

}
