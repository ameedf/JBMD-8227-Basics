package com.ameed.statics;

/**
 * 
 * @author ameed_fah
 *
 */
public class Student {
	private static int COUNTER = 0;

	private int id;

	public Student() {
		COUNTER++;
		this.id = COUNTER;
	}

	public int getId() {
		return id;
	}

	public static void addToCounter(int amount) {
		COUNTER += amount;
	}

}
