package com.ameed.oop.polymorphism;

public class Employee {
	protected String name;

	public Employee(String name) {
		this.name = name;
	}

	public void work() {
		System.out.println(name + " >>> I'm working");
	}
}
