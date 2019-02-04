package com.ameed.oop.interfaces;

import com.ameed.handler.clock.Person;

/**
 * Created by: ameed_fah Date: 28-01-2019
 */
public class DatabaseWriter implements DataWriter {

	private String connection;

	@Override
	public int save(Person person) {
		System.out.println("Saving person " + person.getName() + " to file DATABASE");

		return 0;
	}

	public String getConnection() {
		return connection;
	}

	public void setConnection(String fileName) {
		this.connection = fileName;
	}

}
