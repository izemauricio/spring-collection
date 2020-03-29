package com.ize.springone;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		// load spring application context (container)
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// get object from spring object factory
		Coach bc = context.getBean("myCoach", Coach.class);

		// call methods of the bean
		System.out.println(bc.getDailyWorkout());
		System.out.println(bc.getDailyFortune());

		// close context
		context.close();
	}

}
