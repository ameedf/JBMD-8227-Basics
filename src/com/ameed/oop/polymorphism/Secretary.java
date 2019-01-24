package com.ameed.oop.polymorphism;

public class Secretary extends Employee {

	public Secretary(String name) {
		super(name);
	}

	public void call() {
		System.out.println(name + " >>> I'm calling");
	}

}
