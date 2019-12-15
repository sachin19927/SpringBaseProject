package com.depencyInjection.sample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringSettterDependenyInjection {

	
	public static void main(String[] args) {
		
		
		//load Srping config file
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("depencyapplicationContext.xml");
		
		//retrive spring from container
		TennisCoach tenis=context.getBean("myTennis", TennisCoach.class);
		
		System.err.println(tenis.getFortune());
		System.err.println(tenis.getName());
		System.err.println(tenis.getCountry());
		
		TennisCoach tenisNew=context.getBean("myTennis", TennisCoach.class);
		TennisCoach tenisprototype=context.getBean("myTennisPro", TennisCoach.class);
		TennisCoach tenisprototypeNew=context.getBean("myTennisPro", TennisCoach.class);
		 
		boolean result=(tenis==tenisNew);
		System.err.println("Do they share same Address memry :"+result);
		System.err.println("address of tenis"+tenis);
		System.err.println("address of tenisNew:"+tenisNew);
		
		
		boolean result1=(tenisprototype==tenisprototypeNew);
		System.err.println("Do they share same Address memry :"+result1);
		System.err.println("address of tenisprototype"+tenisprototype);
		System.err.println("address of tenisprototypeNew:"+tenisprototypeNew);
		
		//close context
		context.close();
	}
}
  