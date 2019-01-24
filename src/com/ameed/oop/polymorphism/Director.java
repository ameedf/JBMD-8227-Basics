package com.ameed.oop.polymorphism;
/**
 * 
 * @author ameed_fah
 *
 */
public class Director extends Manager {

	public Director(String name) {
		super(name);
	}

	public void direct() {
		System.out.println(name + " >>> I'm directing");
	}
}
