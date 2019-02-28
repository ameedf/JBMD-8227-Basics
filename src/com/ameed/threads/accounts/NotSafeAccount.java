package com.ameed.threads.accounts;

/**
 * Created by: ameed_fah Date: 25-02-2019
 */
public class NotSafeAccount implements Account {
	private int balance;

	public int getBalance() {
		return balance;
	}

	public void deposit(int amount) {
		balance += amount;
	}

	public void withdraw(int amount) {
		balance -= amount;
	}
}
