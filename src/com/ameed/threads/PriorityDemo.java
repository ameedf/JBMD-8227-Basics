package com.ameed.threads;

/**
 * Created by: ameed_fah Date: 28-02-2019
 */
public class PriorityDemo {
	private static volatile boolean finished = false;

	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(createRunnable());
		t1.setPriority(Thread.MIN_PRIORITY);

		Thread t2 = new Thread(createRunnable());
		t2.setPriority(Thread.MAX_PRIORITY);

		t1.start();
		t2.start();

		Thread.sleep(2000);
		finished = true;
		System.out.println("Main has finished");
	}

	private static Runnable createRunnable() {
		return new Runnable() {
			@Override
			public void run() {
				while (!isFinished()) {
					long sum = 0;
					for (int i = 0; i < 10_000_000; i++) {
						sum += i;
					}
					System.out.println(Thread.currentThread().getName() + ": " + Thread.currentThread().getPriority());
				}
			}
		};
	}

	private static boolean isFinished() {
		return finished;
	}

}
