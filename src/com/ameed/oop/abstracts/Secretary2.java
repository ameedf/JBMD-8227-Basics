package com.ameed.oop.abstracts;

public class Secretary2 extends Employee2 {

	public Secretary2(String name) {
		super(name);
	}

	@Override
	public void work() {
		System.out.println(name + " >>> I'm calling");
	}

}
