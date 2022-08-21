package com.aurionpro.test;

import com.aurionpro.model.DeptWork;
import com.aurionpro.model.IDepartment;

public class DeptWorkTest {

	public static void main(String[] args) {
		DeptWork dw = new DeptWork();
		
		IDepartment role1 = dw.getWork("manager");
		role1.work();
		
		IDepartment role2 = dw.getWork("developer");
		role2.work();
		
		IDepartment role3 = dw.getWork("accountant");
		role3.work();
	}

}
