package com.ameed.exceptions;

/**
 * Created by: ameed_fah Date: 18-02-2019
 */
public class ExceptionsDemo {

	public static void main(String[] args) {
		try {
			convert();
			System.out.println("Everything is OK");
		} catch (Exception e) {
			// Dont do this: e.printStackTrace();
			System.out.println("Something bad happened.. Message: " + e.getMessage());
		}
	}

	private static void convert() throws Exception {
		Converter converter = new Converter();
		converter.toInteger("1");
		converter.toInteger("1x");
	}
}
