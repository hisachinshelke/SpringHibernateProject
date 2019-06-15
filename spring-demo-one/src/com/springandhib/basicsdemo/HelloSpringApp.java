package com.springandhib.basicsdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ICoach theCoach = context.getBean("myCoach", ICoach.class);
		
		System.out.println(theCoach.getDailyWorkoutPlan());

		context.close();
	}

}
