package com.ameed.threads.waiting;

/**
 * Created by: ameed_fah Date: 28-02-2019
 */
public abstract class AbstractJob implements Runnable {
	private boolean finished;
	protected final SharedResource resource;

	public AbstractJob(SharedResource resource) {
		super();
		this.resource = resource;
	}

	@Override
	public void run() {
		while (!isFinished()) {
			try {
				doAction();
			} catch (Exception e) {
				e.printStackTrace();
				setFinished(true);
			}
		}
	}

	public boolean isFinished() {
		return finished;
	}

	public void setFinished(boolean finished) {
		this.finished = finished;
	}

	protected abstract void doAction() throws Exception;

}
