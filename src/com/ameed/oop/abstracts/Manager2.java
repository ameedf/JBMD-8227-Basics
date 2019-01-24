package com.ameed.oop.abstracts;

public class Manager2 extends Employee2 {

	public Manager2(String name) {
		super(name);
	}

	@Override
	public void work() {
		System.out.println(name + " >>> I'm managing");
	}

}
