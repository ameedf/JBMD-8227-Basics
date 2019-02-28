package com.ameed.threads.accounts;

/**
 * Created by: ameed_fah Date: 25-02-2019
 */
public abstract class AbstractClient implements Runnable {
	protected final Account account;

	public AbstractClient(Account account) {
		this.account = account;
	}

	@Override
	public void run() {
		for (int i = 0; i < getIterations(); i++) {
			doAction();
		}
	}

	abstract protected void doAction();

	protected int getFixedAmount() {
		return 2;
	}

	protected int getIterations() {
		return 1000;
	}
}
