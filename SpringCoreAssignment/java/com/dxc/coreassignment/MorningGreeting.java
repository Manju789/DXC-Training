package com.dxc.coreassignment;

import org.springframework.stereotype.Component;

@Component("morningGreeting")
public class MorningGreeting implements Greeting{

	public String greet() {
		// TODO Auto-generated method stub
		return greeting;
	}
	
	String greeting = "Good Morning";

	public MorningGreeting() {
		super();
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	
	
}
