package com.annotaionbased.sample;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("footCoach")
public class FootBallCoach implements Coach {
	
	private FortuneService fortuneservice;
	
	public FootBallCoach() {
		System.err.println("Constructor of Football 1");
	}
	
	@PostConstruct
	public void initMethodPostcall()
	{
		System.err.println("@PostConstruct of football");
	}
	
	@PreDestroy
	public void destoryMethodPrecall()
	{
		System.err.println("@PreDestroy of football");
	}
	
	
	@Autowired
	@Qualifier("randomFortuneService") 
	public void setFortuneservice(FortuneService fortuneservice) {
		this.fortuneservice = fortuneservice;
	}

	@Override
	public String getTask() {
		return "play scooer";
	}

	@Override
	public String getFortune() {
		return "Calling Football "+fortuneservice.getFortune();
	}


}
