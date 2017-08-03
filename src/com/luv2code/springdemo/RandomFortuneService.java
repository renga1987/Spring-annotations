package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] data ={ 
			"Random Fortune Service1","Random Fortune Service2","Random Fortune Service3"
	};
	
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		int index= myRandom.nextInt(data.length);
		
		String fortune = data[index];
		
		return fortune;
	}

}
