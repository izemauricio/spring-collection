package com.ize.springone;

public class TrackCoach implements Coach {

	public void startup() {
		System.out.println("start up");
	}

	public void shutItDown() {
		System.out.println("shutdown");
	}

	private FortuneService fortuneService;

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run the track!";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it " + fortuneService.getFortune();
	}

}
