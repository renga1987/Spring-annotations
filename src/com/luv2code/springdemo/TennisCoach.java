package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	//Field Injection
	@Autowired
	@Qualifier("practiceFortune")
	private FortuneService fortuneService;
	
	// constructor injection
	/*@Autowired 
	public TennisCoach(HappyFortuneService theHappyFortuneService){
		happyFortuneService=theHappyFortuneService;
	}*/
	
	/*public TennisCoach(){
		System.out.println("Inside Default cons");
	}*/
		
	@Override
	public String getDailyWorkout() {		
		return "Practice Tennis";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	// setter injection
	/*@Autowired 
	public void setHappyFortuneService(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}*/
	
	// method injection
	/*@Autowired
	public void doSomeStuff(FortuneService theFortuneService) {
		System.out.println("Inside doSomeStuff");
		this.fortuneService = theFortuneService;
	}*/
	
	
	
}
