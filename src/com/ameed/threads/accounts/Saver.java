package com.ameed.threads.accounts;

/**
 * Created by: ameed_fah Date: 25-02-2019
 */
public class Saver extends AbstractClient {

	public Saver(Account account) {
		super(account);
	}

	@Override
	public void run() {
		for (int i = 0; i < getIterations(); i++) {
			account.deposit(getFixedAmount());
		}
	}

}
