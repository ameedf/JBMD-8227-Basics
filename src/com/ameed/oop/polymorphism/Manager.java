package com.ameed.oop.polymorphism;

public class Manager extends Employee {

	public Manager(String name) {
		super(name);
	}

	public void manage() {
		System.out.println(name + " >>> I'm managing");
	}

}
