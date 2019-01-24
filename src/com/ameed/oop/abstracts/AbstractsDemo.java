package com.ameed.oop.abstracts;

public class AbstractsDemo {
	public static void main(String[] args) {
		// Employee2 employee = new Employee2("emp"); -- ?!?
		Engineer2 engineer = new Engineer2("eng");
		Manager2 manager = new Manager2("man");
		Secretary2 secretary = new Secretary2("sec");
		Director2 director = new Director2("dir");

		engineer.work();
		manager.work();
		secretary.work();
		director.work();
		
		System.out.println("***************************");
		Employee2 employee2 = engineer;
		employee2.work();

		employee2 = director;
		employee2.work();

	}
}
