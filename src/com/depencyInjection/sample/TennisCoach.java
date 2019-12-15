package com.depencyInjection.sample;

public class TennisCoach implements Coach{

	private FortunceService  fortunceservice;
	
	
	private String name;
	private String country;
	
	public TennisCoach() {
		System.err.println("creating Tennis Object");
	}

	// Step create setter methos in class for injection
	public void setFortunceservice(FortunceService fortunceservice) {
		System.err.println("Setingg Dependcy to Tennis Class by Fortune class");
		this.fortunceservice = fortunceservice;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.err.println("Setingg Name to Tennis player");
		this.name = name;
	}


	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		System.err.println("Setingg Country to Tennis player");
		this.country = country;
	}

	@Override
	public String getFortune() {
		return "Tennis brings :"+fortunceservice.getFortune();
	}



	@Override
	public String getTask() {
		return null;
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
