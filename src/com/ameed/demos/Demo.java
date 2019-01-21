package com.ameed.demos;

import com.ameed.handler.clock.Person;
import com.ameed.handler.clock.Student;

/**
 * 
 * 
 * 
 * 
 * @author ameed_fah
 *
 */
public class Demo {

	public static void main(String[] args) {
		// Clock clock = new Clock(4);
		
		// 
		Person p = new Person();
		p.setName("ameed");
		System.out.println(p.getName());
		
		Student s = new Student();
		s.setName("kuku");
		s.print();
	}
}
