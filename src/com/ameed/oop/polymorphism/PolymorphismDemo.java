package com.ameed.oop.polymorphism;
public class PolymorphismDemo {

	public static void main(String[] args) {
		Employee employee = new Employee("emp");
		Engineer engineer = new Engineer("eng");
		Manager manager = new Manager("man");
		Secretary secretary = new Secretary("sec");
		Director director = new Director("dir");

		employee.work();

		engineer.work();
		engineer.design();

		manager.work();
		manager.manage();

		secretary.work();
		secretary.call();

		director.work();
		director.manage();
		director.direct();
		
		System.out.println("***************************");
		Employee employee2 = employee;
		employee2.work();

		employee2 = engineer;
		employee2.work();

		employee2 = manager;
		employee2.work();

		Manager manager2 = manager;
		manager2.manage();

		manager2 = director;
		manager2.manage();
	}
}
