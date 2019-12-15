package com.jaavsourcebase.sample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.annotaionbased.sample.Coach;

public class ClassMain {


	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContextAnnotaions.xml");
		
		Food coach=context.getBean("icecream",Food.class);
		System.err.println(coach.eat());
		System.err.println(coach.mode());
		
		
		Icecream ice=context.getBean("icecream",Icecream.class);
		System.err.println(ice.getName());
		System.err.println(ice.getArea());
		context.close();
	}
}
