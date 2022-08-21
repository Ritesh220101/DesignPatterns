package com.aurionpro.model;

public class Memento {
	private Employee employee;

	public Memento(Employee employee) {
		super();
		this.employee = employee;
	}

	public Employee getEmployee() {
		return employee;
	}

}
