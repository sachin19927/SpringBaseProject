package com.depencyInjection.sample;

//Step 1 : define Dependency Interface and class
public class HappyFortuneService implements FortunceService {

	
	@Override
	public String getFortune() {
		return "Today i my lucky Day";
	}

}
