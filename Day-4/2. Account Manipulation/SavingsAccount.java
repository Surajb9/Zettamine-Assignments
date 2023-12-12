package com.zettamine.day4.accountManipulation;

public class SavingsAccount extends Account {
 
	 private double minimumBalance;

	public SavingsAccount(int accountNumber, Customer customerObj, double balance, double minimumBalance) {
		super(accountNumber, customerObj, balance);
		this.minimumBalance = minimumBalance;
	}

	public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
	public boolean withdraw(double amount) {
		if(this.balance > this.minimumBalance && amount < this.balance) {
			this.balance -= amount;
			return true;
		}
		else {
			return false;
		}
	}
}
