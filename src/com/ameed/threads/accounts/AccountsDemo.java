package com.ameed.threads.accounts;

/**
 * Created by: ameed_fah Date: 25-02-2019
 */
public class AccountsDemo {

	public static void main(String[] args) throws InterruptedException {
		Account account = new Account();

		new Thread(new Saver(account)).start();
		new Thread(new Spender(account)).start();

		Thread.sleep(1000);
		// should print 0
		System.out.println(account.getBalance());
	}
}
