package com.ameed.oop.polymorphism;
/**
 * 
 * @author ameed_fah
 *
 */
public class Engineer extends Employee {

	public Engineer(String name) {
		super(name);
	}

	public void design() {
		System.out.println(name + " >>> I'm designing");
	}
}
