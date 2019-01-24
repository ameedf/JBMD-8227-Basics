package com.ameed.handler.clock;

/**
 * 
 * @author ameed_fah
 *
 */
public class Clock2 {

	private int hours;
	private int minutes;
	private int seconds;
	private int milliseconds;

	public Clock2() {
		this.hours = 1;
		this.minutes = 2;
		this.seconds = 3;
		this.milliseconds = 4;
	}

	public Clock2(int hours) {
		this();
		this.hours = hours;
	}

	public Clock2(int hours, int minutes) {
		this(hours);
		this.minutes = minutes;
	}

	public Clock2(int hours, int minutes, int seconds) {
		this(hours, minutes);
		this.seconds = seconds;
	}

	public Clock2(int hours, int minutes, int seconds, int milliseconds) {
		this(hours, minutes, seconds);
		this.milliseconds = milliseconds;
	}

}
