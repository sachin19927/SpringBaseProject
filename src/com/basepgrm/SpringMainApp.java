package com.basepgrm;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMainApp {
	
	public static void main(String[] args) {
		
		// creating Spring Container 
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrive bean from Container 
		Engeering eng=context.getBean("myApp", Engeering.class);
		
		// call the methos of bean
		System.err.println(eng.getDescription());
		
		//close the context
		context.close();
	} 	



	
}
