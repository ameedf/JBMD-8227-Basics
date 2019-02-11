package com.ameed.scanner;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by: ameed_fah
 * Date: 11-02-2019
*/
public class ScannerDemo {

	public static void main(String[] args) {
		Object o = new Object();
		o.equals(new Object());
		int number = UserInput.between("Please enter a number in the range [0..10]", 0, 10);
		System.out.println("Number is : " + number);
		
		Random random = new Random();
		int randomInteger = random.nextInt(11) - 5; // between (-5)-5
		double doubleNumber = random.nextDouble(); // 0.. 0.9999999
		double double2 = doubleNumber * 10; // 0.. 9.999999
		double double3 = random.nextDouble() * 10 + 10; // 10.. 19.999999
		
		
	}
}
