package com.ize.springone;

public class BaseballCoach implements Coach {

	// private field to hold dependency
	private FortuneService fortuneService;

	// a constructor is need to inject the dependency into the private field
	// now this class is ready to accept constructor dependency injection
	BaseballCoach(FortuneService fs) {
		fortuneService = fs;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutos baseball";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
