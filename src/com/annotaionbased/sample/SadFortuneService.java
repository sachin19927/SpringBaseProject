package com.annotaionbased.sample;

import org.springframework.stereotype.Component;
public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "AUTOWIRE FORTUNE SadFortuneService";
	}

}
