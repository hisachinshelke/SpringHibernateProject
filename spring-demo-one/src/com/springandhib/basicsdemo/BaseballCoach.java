package com.springandhib.basicsdemo;

public class BaseballCoach implements ICoach{

	@Override
	public String getDailyWorkoutPlan() {
		return "Practise baseball daily for 30 mins";
	}
}
