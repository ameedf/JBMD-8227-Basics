package com.ameed.oop.abstracts;

public class Director2 extends Manager2 {

	public Director2(String name) {
		super(name);
	}

	@Override
	public void work() {
		super.work();
		System.out.println(name + " >>> I'm directing");
	}
}
