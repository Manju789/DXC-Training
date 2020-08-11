package com.dxc.coreassignment;

import org.springframework.stereotype.Component;

@Component("goodDayGreeting")
public class GoodDayGreeting implements Greeting{

	public String greet() {
		// TODO Auto-generated method stub
		return greeting;
	}
	
	String greeting = "Have a Good Day";

	public GoodDayGreeting() {
		super();
		
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	
	
}
