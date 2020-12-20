package com.ize.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// read context file
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		// get bean
		Coach c = ctx.getBean("tennisCoach", TennisCoach.class);

		// call bean method
		System.out.println(c.getDailyWorkout());

		// close
		ctx.close();
	}

}
