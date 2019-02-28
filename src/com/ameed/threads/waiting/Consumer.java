package com.ameed.threads.waiting;

/**
 * Created by: ameed_fah Date: 28-02-2019
 */
public class Consumer extends AbstractJob {

	public Consumer(SharedResource resource) {
		super(resource);
	}

	@Override
	protected void doAction() throws Exception {
		synchronized (resource) {
			int number = this.resource.getNumber();
			while (number % 10 != 0) {
				resource.wait();
				number = this.resource.getNumber();
			}

			System.out.println(number + " can be divided by 10");
		}
		Thread.sleep(1);
	}

}
