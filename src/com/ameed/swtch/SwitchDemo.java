package com.ameed.swtch;

/**
 * Created by: ameed_fah Date: 04-02-2019
 */
public class SwitchDemo {

	public static void main(String[] args) {
		int x = 1;

		String s = convertGender(x);
		System.out.println(s);
	}

	private static String convertGender(int code) {
		switch (code) {
		case 1:
			return "M";
		case 2:
			return "F";
		default:
			return "?";
		}
	}
}
