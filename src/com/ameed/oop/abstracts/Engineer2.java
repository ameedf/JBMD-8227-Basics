package com.ameed.oop.abstracts;

public class Engineer2 extends Employee2 {

	public Engineer2(String name) {
		super(name);
	}

	@Override
	public void work() {
		System.out.println(name + " >>> I'm designing");
	}
}
