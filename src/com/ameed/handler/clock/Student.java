package com.ameed.handler.clock;

/**
 * 
 * @author ameed_fah
 *
 */

public class Student extends Person {

	private int average;

	
	public Student() {
		super();
		this.average = -1;
	}

	public int getAverage() {
		return average;
	}

	public void setAverage(int average) {
		this.average = average;
	}

	@Override
	public String getName() {
		return "AAA";
	}

	public String getName(String prefix) {
		return prefix + this.getName() + 1;
	}

	public void print(int x) {
		System.out.println(x);
	}

	public void print() {
		System.out.println("Student name: " + name + ", average: " + average);
	}

}
