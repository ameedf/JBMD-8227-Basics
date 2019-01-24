package com.ameed.statics;

/**
 * 
 * @author ameed_fah
 *
 */
public class StaticDemo {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Student s = new Student();
			System.out.println(s.getId());
			if (i % 3 == 0) {
				Student.addToCounter(i);
			}
		}
	}
}
