package com.aurionpro.model;

public class Originator {
	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public Memento saveStatetoMemento() {
		return new Memento(employee);
	}
	
	public void getStateFromMemento(Memento memento) {
		employee = memento.getEmployee();
	}
}
