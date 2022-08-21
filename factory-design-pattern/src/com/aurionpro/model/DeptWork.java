package com.aurionpro.model;

public class DeptWork {
	public IDepartment getWork(String role) {
		if (role == null)
			return null;
		if (role.equalsIgnoreCase("Manager"))
			return new Manager();
		if (role.equalsIgnoreCase("Developer"))
			return new Developer();
		if (role.equalsIgnoreCase("Accountant"))
			return new Accountant();
		return null;
	}
}
