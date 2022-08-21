package com.aurionrpo.test;

import com.aurionrpo.model.Account;
import com.aurionrpo.model.EmailNotifier;
import com.aurionrpo.model.INotifier;
import com.aurionrpo.model.SMSNotifier;

public class AccountTest {

	public static void main(String[] args) {
//		Account acc = new Account(1, "ritz", 10000);
//		acc.registerNotifier(new EmailNotifier());
//		acc.registerNotifier(new SMSNotifier());
//		acc.deposit(1000);
//		System.out.println("---------------------------");
//		acc.withdraw(2000);
		
		Account acc1 = new Account(2,"zitr",20000);
		
		acc1.deposit(1000);
	}

}
