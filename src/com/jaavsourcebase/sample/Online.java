package com.jaavsourcebase.sample;

import org.springframework.stereotype.Component;

@Component
public class Online implements Order {

	@Override
	public String mode() {
		return "ZOMATO";
	}

}
