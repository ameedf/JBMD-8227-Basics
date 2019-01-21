package com.ameed.handler.clock;

/**
 * 
 * @author ameed_fah
 *
 */

public class Person {
	protected String name;

	public String getName() {
		Clock c = new Clock();
		c.hours = 9; // this is available because the visibility is "package"
		return name;
	}

	public void setName(String name) {
		if (name != null && name.length() < 10) {
			this.name = name;
		}
	}

}
