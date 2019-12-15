package com.jaavsourcebase.sample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.annotaionbased.sample.Coach;

public class ClassMainJava {


	public static void main(String[] args) {
		///ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContextAnnotaions.xml");
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
		Food coach=context.getBean("pizza",Food.class);
		System.err.println(coach.eat());
		System.err.println(coach.mode());
		
		
		  Icecream ice=context.getBean("icecream",Icecream.class);
		 System.err.println(ice.getName()); System.err.println(ice.getArea());
		 
		 Food coach1=context.getBean("kfc",Food.class);
		 System.err.println(coach1.mode());
		 
		context.close();
	}
}
