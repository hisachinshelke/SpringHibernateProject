package com.springandhib.basicsdemo;

public class MyApp {
	public static void main(String[] args) {

		//BaseballCoach thisCoach = new BaseballCoach();
		ICoach thisCoach = new BaseballCoach();
		System.out.println(thisCoach.getDailyWorkoutPlan());
		
		ICoach thisCoach2 = new TrackCoach();
		System.out.println(thisCoach2.getDailyWorkoutPlan());
	}
}
