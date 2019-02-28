package com.ameed.threads.accounts;

/**
 * Created by: ameed_fah Date: 25-02-2019
 */
public class AccountsDemo {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Account 1: Not safe");
		testAccount(new NotSafeAccount());

		System.out.println("Account 2: Safe");
		testAccount(new SafeAccount());
	}

	private static void testAccount(Account account) throws InterruptedException {
		Thread t1 = new Thread(new Saver(account));
		Thread t2 = new Thread(new Spender(account));
		t1.start();
		t2.start();

		t2.join();
		t1.join();
		System.out.println("Balance:" + account.getBalance());
		System.out.println("------------------------");
	}
}
