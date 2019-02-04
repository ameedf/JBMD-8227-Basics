package com.ameed.oop.interfaces;

import com.ameed.handler.clock.Person;

/**
 * 
 * @author ameed_fah
 *
 */
public interface DataWriter {
	int CONST1 = 5;
	
	int save(Person person);

	default int saveAndPrint(Person person) {
		System.out.println(person.getName());
		return save(person);
	}
}
