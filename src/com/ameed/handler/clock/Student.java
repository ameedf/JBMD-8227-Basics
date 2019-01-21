package com.ameed.handler.clock;

/**
 * 
 * @author ameed_fah
 *
 */

public class Student extends Person {

	private int average;

	public int getAverage() {
		return average;
	}

	public void setAverage(int average) {
		this.average = average;
	}
	
	public void print() {
		System.out.println("Student name: " + name + ", average: " + average);
	}
	
}
