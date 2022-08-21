package com.aurionrpo.model;

public class EmailNotifier implements INotifier {

	@Override
	public void sendNotification(Account acc, double amount, String transaction) {
		System.out.println("Email has been sent");
		System.out.println("Transaction type: "+transaction);
		System.out.println("Amount :"+amount);
		System.out.println("Balance: "+acc.getBalance());
		
	}

}
