package com.annotaionbased.sample;

import org.springframework.stereotype.Component;
//Step 1 : dependency for Class Autowire
@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "AUTOWIRE FORTUNE HappyFortuneService";
	}

}
