package com.annotaionbased.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class CricketCoach implements Coach {

	
	private FortuneService fortuneService;
	
	
	// Inject Any methos instead of Setter
	@Autowired
	@Qualifier("randomFortuneService") 
	public void doRunAnyMethod( FortuneService fortuneService)
	{
		this.fortuneService=fortuneService;
	}
	
	@Override
	public String getTask() {
		return "Score 100 ";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune()+ " set by Diff methos Not by setter";
	}

	

}
