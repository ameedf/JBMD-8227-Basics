package com.ameed.threads.accounts;

/**
 * Created by: ameed_fah Date: 25-02-2019
 */
public interface Account {
	int getBalance();

	void deposit(int amount);

	void withdraw(int amount);
}
