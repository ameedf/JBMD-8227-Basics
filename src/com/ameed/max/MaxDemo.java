package com.ameed.max;

/**
 * Created by: ameed_fah Date: 04-02-2019
 */
public class MaxDemo {
	public static void main(String[] args) {

		int x = 1;
		int y = 3;
		int z = 2;

		System.out.println(max1(x, y, z));
		System.out.println(max2(x, y, z));
	}

	private static int max1(int x, int y, int z) {
		int tmp = x;
		
		if (y > x) {
			tmp = y;
		}
		if (z > tmp) {
			tmp = z;
		}
		return tmp;
	}
	
	private static int max2(int x, int y, int z) {
		if ((x > y) && (x > z)) {
			return x;
		}
		if ((y > x) && (y > z)) {
			return y;
		}
		return z;
	}

}
