package com.annotaionbased.sample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaCongifWithLogger {

	

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MyLoggerConfig.class,JavaConfigBased.class);
		
		Coach coach=context.getBean("swimCoach",Coach.class);
		
		System.err.println(coach.getFortune());
		context.close();
	}
}
