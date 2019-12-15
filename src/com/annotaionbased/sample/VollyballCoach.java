package com.annotaionbased.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class VollyballCoach implements Coach{

	// Feild injection add depency
	@Autowired   // field Injection
	@Qualifier("randomFortuneService")   // amoong multiple impl selecting which impl to explicitly
	private FortuneService fortuneservice;
	
	
	@Value("${name.palyer}")    // Set Literal Values using Annotains  and also import from proprty files config proprty scan in confgi file
	private String name;
	@Value("${country.player}")
	private String Country;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	@Override
	public String getTask() {
		return null;
	}

	@Override
	public String getFortune() {
		return fortuneservice.getFortune()+" feild injection with no settter  java reflection will handle this part";
	}

}
