package com.springpractise;  

public class BasketballCoach implements Coach {

	private FortuneService fortuneService;
	
	public BasketballCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyRoutine() {
		return "Run 5 km daily.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
}