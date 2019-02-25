package com.ameed.collections;

import java.util.Comparator;

/**
 * Created by: ameed_fah Date: 21-02-2019
 */
public class LengthComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		if (o1.length() == o2.length()) {
			return 0;
		}
		if (o1.length() < o2.length()) {
			return -1;
		}
		return 1;
	}

}
