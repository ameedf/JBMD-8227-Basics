package com.ameed.collections;

import java.util.Comparator;

/**
 * Created by: ameed_fah Date: 21-02-2019
 */
public class ReverseComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return -o1.compareTo(o2);
	}

}
