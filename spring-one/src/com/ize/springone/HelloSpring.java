package com.ize.springone;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		// load spring application context (container)
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// get bean from spring object factory using interface
		// Coach bc = context.getBean("myCricketCoach", Coach.class);

		// get bean from spring object factory using class
		CricketCoach bc = context.getBean("myCricketCoach", CricketCoach.class);

		// call methods of the bean
		System.out.println(bc.getDailyWorkout());
		System.out.println(bc.getDailyFortune());
		System.out.println(bc.getEmail());
		System.out.println(bc.getName());

		// close context
		context.close();
	}

}
