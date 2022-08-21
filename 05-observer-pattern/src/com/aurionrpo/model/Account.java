package com.aurionrpo.model;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private double accountNumber;
	private String name;
	private double balance;
	private List<INotifier> notifiers;

	public Account(double accountNumber, String name, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		notifiers = new ArrayList<>();
	}

	public double getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}
	
	public void withdraw(double amount) {

		if (amount > balance)
			System.out.println("Insufficient funds");
		else {
			balance -= amount;
			for (INotifier n : notifiers)
				n.sendNotification(this, amount, "withdraw");
		}

	}

	public void deposit(double amount) {
		if(amount<=0)
			System.out.println("Invalid fund");
		else {
			balance += amount;
			for(INotifier n:notifiers)
				n.sendNotification(this,amount,"deposit");
		}
		
	}

	public void registerNotifier(INotifier notifier) {
		notifiers.add(notifier);
	}
}
