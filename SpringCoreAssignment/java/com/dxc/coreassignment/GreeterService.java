package com.dxc.coreassignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GreeterService {
	
	@Autowired
	@Qualifier("morningGreeting")
	Greeting greetref;
	void printGreeting() {
		System.out.println(greetref.greet());
	}
}
