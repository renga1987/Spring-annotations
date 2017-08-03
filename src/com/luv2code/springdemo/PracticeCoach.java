package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class PracticeCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		return "Practice coach";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}

}
