package com.annotaionbased.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// step 2 Add @Component to your class
@Component
@Scope("singleton")
public class TennisCoach implements Coach{
	
	
//Step 2 : create a constructor in your  class for injection
	private FortuneService fortuneservice;
	
	
	// config dependency injection using autowire
	@Autowired    // FROM SPRING 4.3 IT IS NOT MANDATORY USE @aUTOWIRE FOR cONSTRUCTOR INJECTION AND @QUALIFER should be passed as parameter
	public TennisCoach(@Qualifier("randomFortuneService") FortuneService fortuneservice) {
	this.fortuneservice = fortuneservice;
}

	@Override
	public String getTask() {
		return "play 2 sets";
	}

	@Override
	public String getFortune() {
		return fortuneservice.getFortune();
	}


}
