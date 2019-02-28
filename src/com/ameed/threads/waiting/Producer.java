package com.ameed.threads.waiting;

import java.util.Random;

/**
 * Created by: ameed_fah Date: 28-02-2019
 */
public class Producer extends AbstractJob {

	private Random r = new Random();

	public Producer(SharedResource resource) {
		super(resource);
	}


	@Override
	protected void doAction() throws Exception {
		synchronized (resource) {
			this.resource.setNumber(r.nextInt());
			resource.notify();
		}
	}

}
