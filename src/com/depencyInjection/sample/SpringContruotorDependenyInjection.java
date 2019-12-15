package com.depencyInjection.sample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringContruotorDependenyInjection {

	
	public static void main(String[] args) {
		
		
		//load Srping config file
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("depencyapplicationContext.xml");
		
		//retrive spring from container
		Coach coach=context.getBean("myCoach", Coach.class);
		
		//call methos on bean
		System.err.println(coach.getTask());
		System.err.println(coach.getFortune());
		
		
		Coach coachNew=context.getBean("myCoach", Coach.class);
		
		
		boolean result=(coach==coachNew);
		System.err.println("Do they share same Address memry :"+result);
		System.err.println("address of coach"+coach);
		System.err.println("address of coachNew:"+coachNew);
		
		//close context
		context.close();
	}
}
