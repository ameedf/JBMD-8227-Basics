package com.ameed.handler.clock;

/**
 * 
 * @author ameed_fah
 *
 */
public class Clock {

	private int hours;
	private int minutes;
	private int seconds;
	private int milliseconds;

	public Clock() {
		this(1, 2, 3, 4);
	}

	public Clock(int hours) {
		this(hours, 2, 3, 4);
	}

	public Clock(int hours, int minutes) {

	}

	public Clock(int hours, int minutes, int seconds) {
		this(hours, minutes, seconds, 4);
	}

	public Clock(int hours, int minutes, int seconds, int milliseconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
		this.milliseconds = milliseconds;
	}

	public void add(int hours) {

	}

	public void add(int hours, int minutes) {
		///
	}

	public void dummy() {
		Person p = new Person();
		p.name = "C";
	}

}
