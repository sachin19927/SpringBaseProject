package com.annotaionbased.sample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigBasedMain {

	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(JavaConfigBased.class);
		Coach coach=context.getBean("footCoach", Coach.class);
		System.err.println(coach.getTask());
		
		// dependnecy Setter Injection using Autowire
		System.err.println(coach.getFortune());
		
		
		// use default bean id
		Coach cricket=context.getBean("cricketCoach", Coach.class);
		System.err.println(cricket.getTask());
		System.err.println(cricket.getFortune()); 
		
		
		// Dependcy injection using auto wired Constructor
		Coach tennis=context.getBean("tennisCoach", Coach.class); 
		System.err.println(tennis.getFortune());
		
		
		Coach volly=context.getBean("vollyballCoach", Coach.class);
		System.err.println(volly.getFortune());
		VollyballCoach vollyball=context.getBean("vollyballCoach", VollyballCoach.class);
		System.err.println(vollyball.getName());
		System.err.println(vollyball.getCountry());
		
		HockeyCoach hockCoach=context.getBean("hockeyCoach", HockeyCoach.class);
		System.err.println(hockCoach.data);
		
		context.close();
	}
}
