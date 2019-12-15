package com.jaavsourcebase.sample;

import org.springframework.stereotype.Component;

@Component
public class Offline implements Order {

	
	public Offline() {
		System.err.println("OFFCLICE CNSTR");// TODO Auto-generated constructor stub
	}
	@Override
	public String mode() {
		return "SHOP";
	}

}
