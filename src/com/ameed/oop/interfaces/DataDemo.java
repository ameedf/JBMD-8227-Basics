package com.ameed.oop.interfaces;

import com.ameed.handler.clock.Person;

/**
 * Created by: ameed_fah
 * Date: 27-01-2019
*/
public class DataDemo {

	public static void main(String[] args) {
		Person person = new Person();
		person.setName("avi");
		FileWriter writer1 = new FileWriter();
		savePerson(person, writer1);
		
		DataWriter writer2 = new DatabaseWriter();
		savePerson(person, writer2);
	}

	private static void savePerson(Person person, DataWriter writer) {
		writer.save(person);
	}
}
