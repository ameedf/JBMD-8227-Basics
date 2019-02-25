package com.ameed.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.ameed.Person;

/**
 * Created by: ameed_fah Date: 21-02-2019
 */
public class MapTest {
	public void testMaps() {
		
		// map ids to persons
		Map<String, Person> persons = new HashMap<>();
		
		Person avi1 = new Person("avi", 10);
		persons.put("023", avi1);
		Person value = persons.get("023");
		boolean exists = persons.containsKey("023");
		
		persons.get("023")
			.getName()
			.toLowerCase();
		
		persons.put("333", persons.get("023"));
		persons.put("333", persons.get("023"));
		
		Set<String> keys = persons.keySet();
		for (String id : keys) {
			
		}
		
		
		System.out.println(avi1.getName());
		System.out.println(value.getName());
		persons.put("023", new Person("avi junior", 1));
	}

}
