package com.annotaionbased.sample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.annotaionbased.sample") // It is Optional We can Config Bean mannualy no need to scan if using annotaion then it is required
@PropertySource("classpath:external.properties") // to import property files
public class JavaConfigBased {
	
	
	@Bean
	public FortuneService sadFortuneService()  //sadFortuneService() bean id
	
	{
		return new SadFortuneService();
	}
	
	@Bean
	public Coach swimCoach()
	{
		return new SwimCoach(sadFortuneService());
	}

}
