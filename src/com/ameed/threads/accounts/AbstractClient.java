package com.ameed.threads.accounts;

/**
 * Created by: ameed_fah Date: 25-02-2019
 */
public abstract class AbstractClient implements Runnable {
	protected final Account account;

	public AbstractClient(Account account) {
		this.account = account;
	}

	protected int getFixedAmount() {
		return 50;
	}

	protected int getIterations() {
		return 10000;
	}
}
