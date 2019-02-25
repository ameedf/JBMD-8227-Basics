package com.ameed.threads;

/**
 * Created by: ameed_fah Date: 25-02-2019
 */
public class ThreadsDemo {

	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter();

		for (int i = 0; i < 10; i++) {
			runWithThreads(counter);
		}

		Thread.sleep(5000);
		// should print 0
		System.out.println(counter.getNumber());
	}

	private static void runWithThreads(Counter counter) {
		Add add = new Add(counter);
//		Sub sub = new Sub(counter);

		Thread t1 = new Thread(add);
//		Thread t2 = new Thread(sub);

		t1.start();
//		t2.start();
	}
}
