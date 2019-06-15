package com.springpractise;

public class TennisCoach implements Coach {

	private FortuneService fortuneService;

	public void setTennisFortune(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}

	@Override
	public String getDailyRoutine() {
		return "Practise Tennis daily!!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
