package com.ameed.oop.interfaces;

import com.ameed.handler.clock.Person;

/**
 * Created by: ameed_fah Date: 28-01-2019
 */
public class FileWriter implements DataWriter {

	private String fileName;

	@Override
	public int save(Person person) {
		System.out.println("Saving person " + person.getName() + " to file system");

		return 0;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

}
