package com.aurionpro.model;

public abstract class Employee {
	abstract void login();

	abstract void doWork();

	abstract void takeBreak();

	abstract void logOut();

	public final void workRoutine() {
		login();
		doWork();
		takeBreak();
		logOut();
	}

}
