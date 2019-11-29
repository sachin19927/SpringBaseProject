package com.jaavsourcebase.sample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.jaavsourcebase.sample")
@PropertySource("classpath:external.properties")
public class SpringConfig {
	
	
	@Bean
	public Order order()
	{
		return new Online();
	}
	
	
	@Bean
	public Food kfc()
	{
		return new Kfc(order());
	}

}
