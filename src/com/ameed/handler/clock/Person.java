package com.ameed.handler.clock;

/**
 * 
 * @author ameed_fah
 *
 */

public class Person {
	protected String name;

	
	public Person() {
		super();
		this.name = "default";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null && name.length() < 10) {
			this.name = name;
		}
	}

}
