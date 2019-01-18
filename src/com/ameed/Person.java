package com.ameed;

public class Person {
	int age;
	private String name;

	public int getAge() {
		return age;
	}

	public void changeState(String firstName, String lastName) {
		setName(firstName + " " + lastName);
	}

	public void changeState(int newAge, String newName) {

	}

	public void changeState(String newName, int newAge) {
		age = newAge;
		setName(newName);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println(this.name);
		System.out.println(name);
		this.name = name;
	}
}
