package com.ameed.threads.accounts;

/**
 * Created by: ameed_fah Date: 25-02-2019
 */
public class SafeAccount implements Account {
	private int balance;

	public int getBalance() {
		return balance;
	}

	public synchronized void deposit(int amount) {
		balance += amount;
	}

	public synchronized void withdraw(int amount) {
		balance -= amount;
	}
}
