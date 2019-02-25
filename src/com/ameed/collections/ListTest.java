package com.ameed.collections;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by: ameed_fah
 * Date: 21-02-2019
*/
public class ListTest {
	public void testLists() {
		List<String> names = new LinkedList<>();
		names.add("ameed");
		names.add("lili");
		names.add(2, "avi");
		names.add("shula");
		print(names);
		
		Collections.sort(names);
		print(names);
		Collections.sort(names, new ReverseComparator());
		print(names);
	}

	public static void print(Collection<?> items) {
		System.out.println("-----------------");
		for (Object item : items) {
			System.out.println(item);
		}
	}

}
