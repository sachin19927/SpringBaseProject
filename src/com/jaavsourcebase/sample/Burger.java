package com.jaavsourcebase.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Burger implements Food {

	
	
	private Order order;
	
	
	

	@Autowired 
	@Qualifier("offline")
	public void setOrder(Order order) { this.order = order; }
	 
	
	/*
	 * @Autowired public void soumya(Order order) { this.order = order; }
	 */
	@Override
	public String prapre() {
		return "italian";
	}

	@Override
	public String eat() {
		return "4 slics";
	}

	@Override
	public String mode() {
		return order.mode()+ "SQIGGY";
	}

}
