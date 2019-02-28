package com.ameed.threads.waiting;

/**
 * Created by: ameed_fah Date: 28-02-2019
 */
public class WaitDemo {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("start");
		SharedResource resource = new SharedResource();

		Producer producer = new Producer(resource);
		new Thread(producer).start();

		Consumer consumer = new Consumer(resource);
		new Thread(consumer).start();

		Thread.sleep(3000);
		consumer.setFinished(true);
		producer.setFinished(true);
		Thread.sleep(10);
		System.out.println("finished");
	}
}
