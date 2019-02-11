package com.ameed.scanner;

import java.util.Scanner;

/**
 * Created by: ameed_fah Date: 11-02-2019
 */
public class UserInput {

	public static int between(String message, int min, int max) {
		try (Scanner scanner = new Scanner(System.in)) {
			int input;
			do {
				System.out.println(message);
				input = scanner.nextInt();
			} while (input < min || input > max);

			return input;
		}
	}
}
