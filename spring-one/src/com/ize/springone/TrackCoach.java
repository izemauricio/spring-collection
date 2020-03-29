package com.ize.springone;

public class TrackCoach implements Coach {

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
