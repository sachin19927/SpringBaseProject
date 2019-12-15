package com.annotaionbased.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class SwimCoach implements Coach{

	
	
	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService fortuneService) {
this.fortuneService=fortuneService;
	}

	@Override
	public String getTask() {
		return null;
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune()+" feild injection java config partbased using no annotaons";
	}

}
