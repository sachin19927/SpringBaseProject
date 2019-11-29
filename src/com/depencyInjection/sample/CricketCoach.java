package com.depencyInjection.sample;

public class CricketCoach implements Coach {

	//Step 2 : create constructor in your class for injections
	// define private feild for dependency 
	private FortunceService fortunceService;
	
	//define constructor for DI
	public CricketCoach(FortunceService fortunceService) {
		this.fortunceService = fortunceService;
	}
	
	@Override
	public String getTask() {
		return "Bowling Practice";
	}



	@Override
	public String getFortune() {
		//use my fortune Service to get fortune
		return fortunceService.getFortune();
	}
	
	
	// add init method
	public void beginCode()
	{
		System.err.println("init method");
	}
	
	// add destroy method
	public void destoryCode()
	{
		System.err.println("destory method");
	}

}
