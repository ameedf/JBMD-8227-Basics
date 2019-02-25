package com.ameed.threads.accounts;

/**
 * Created by: ameed_fah Date: 25-02-2019
 */
public class Spender extends AbstractClient {

	public Spender(Account account) {
		super(account);
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			account.withdraw(getFixedAmount());
		}
	}

}
