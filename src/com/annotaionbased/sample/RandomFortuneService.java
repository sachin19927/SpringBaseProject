package com.annotaionbased.sample;

import java.util.Random;

import org.springframework.stereotype.Component;
//Step 1 : dependency for Class Autowire
@Component
public class RandomFortuneService implements FortuneService {

	//Create n array of string
	
	private String[] data= {"case1","case 2","case 3"};
	
	
	public RandomFortuneService() {
		
		System.err.println("Randomw Controtor dedency calss"  );
	}
	
	// create a Random Number
	
	Random randomw =new Random(); 	
	
	@Override
	public String getFortune() {
		int index=randomw.nextInt(data.length);
		String fortune=data[index];
		return fortune;
	}

}
