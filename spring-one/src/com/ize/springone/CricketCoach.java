package com.ize.springone;

public class CricketCoach implements Coach {

	// private field to hold the dependency
	private FortuneService fortuneService;

	// setter method dependency injection
	public void setFortuneService(FortuneService fs) {
		this.fortuneService = fs;
	}

	// private fields to hold data of this cricket coach
	// values will be injected
	private String name;
	private String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public CricketCoach() {
		System.out.println("Inside CricketCoach constructor");
	}

	@Override
	public String getDailyWorkout() {
		return "Here is your cricket workout";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
