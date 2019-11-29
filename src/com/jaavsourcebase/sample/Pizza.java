package com.jaavsourcebase.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pizza implements Food {

	
	
	private Order order;
	
	
	
	@Autowired
	public Pizza(@Qualifier("online") Order order) {
		this.order = order;
	}

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
		return order.mode();
	}

}
