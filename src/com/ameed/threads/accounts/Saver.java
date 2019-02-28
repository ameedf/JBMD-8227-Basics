package com.ameed.threads.accounts;

/**
 * Created by: ameed_fah Date: 25-02-2019
 */
public class Saver extends AbstractClient {

	public Saver(Account account) {
		super(account);
	}

	@Override
	protected void doAction() {
		account.deposit(getFixedAmount());
	}

}
