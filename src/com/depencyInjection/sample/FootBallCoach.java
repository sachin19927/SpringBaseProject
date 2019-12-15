package com.depencyInjection.sample;

public class FootBallCoach implements Coach {

	private FortunceService fortumeService;
	
	
	public void beginCode()
	{
		System.err.println("init method");
	}
	
	public void destoryCode()
	{
		System.err.println("destory method");
	}
	
	public  FootBallCoach(FortunceService fortumeService) {
		System.err.println("Creating Depenency");
	this.fortumeService=fortumeService;
	}
	
	@Override
	public String getTask() {
		return "Goal Keeping Practice";
	}

	@Override
	public String getFortune() {
		return "My Own "+fortumeService.getFortune();
	}

}
