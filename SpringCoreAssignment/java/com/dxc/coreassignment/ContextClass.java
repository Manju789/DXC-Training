package com.dxc.coreassignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ContextClass {

	private static ApplicationContext context;

	public static void main(String[] args) {
		
		context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		GreeterService greeter = context.getBean(GreeterService.class);
		greeter.printGreeting();

	}

}
