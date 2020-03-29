package com.ize.springone;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScope {

	public static void main(String[] args) {

		// load context
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext2.xml");
		Coach coach1 = ctx.getBean("myCoach", Coach.class);
		Coach coach2 = ctx.getBean("myCoach", Coach.class);
		System.out.println(coach1 == coach2);
	}

}
