package com.ize.spring;

import org.springframework.stereotype.Component;

//@Component("TennisBeanId")
@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Here is your tennis workout";
	}

}
