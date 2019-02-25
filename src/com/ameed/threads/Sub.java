package com.ameed.threads;

/**
 * Created by: ameed_fah Date: 25-02-2019
 */
public class Sub implements Runnable {

	private Counter counter;

	public Sub(Counter counter) {
		this.counter = counter;
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			counter.decrement();
		}
		System.out.println("finished " + Thread.currentThread().getName());
	}

}
