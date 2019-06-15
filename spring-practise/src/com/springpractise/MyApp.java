package com.springpractise;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appilcationContext1.xml");
		
		Coach coach = context.getBean("myCoach", Coach.class);
		Coach trackCoach = context.getBean("myTrackCoach", Coach.class);
		Coach tennisCoach = context.getBean("myTennisCoach", Coach.class);
		
		System.out.println(coach.getDailyRoutine());
		System.out.println(coach.getDailyFortune());
		
		
		System.out.println(trackCoach.getDailyRoutine());
		System.out.println(trackCoach.getDailyFortune());
		
		System.out.println(tennisCoach.getDailyRoutine());
		System.out.println(tennisCoach.getDailyFortune());
		context.close();
	}
}
