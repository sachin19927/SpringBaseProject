package com.annotaionbased.sample;

import org.springframework.stereotype.Component;

@Component
public class HockeyCoach implements Coach{

	String[] data= {"a","b","c","d","e"};
	
	
	public String[] getData() {
		return data;
	}

	public void setData(String[] data) {
		this.data = data;
	}

	@Override
	public String getTask() {
		return null;
	}

	@Override
	public String getFortune() {
		return null;
	}

}
