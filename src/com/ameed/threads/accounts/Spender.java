package com.ameed.threads.accounts;

/**
 * Created by: ameed_fah Date: 25-02-2019
 */
public class Spender extends AbstractClient {

	public Spender(Account account) {
		super(account);
	}

	@Override
	protected void doAction() {
		account.withdraw(getFixedAmount());
	}

}
