package com.java.spring_framework_project.helloworld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldSpring {

	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("person2MethodCall"));
			System.out.println(context.getBean("person3Parameters"));
			System.out.println(context.getBean("myAddress"));
			System.out.println(context.getBean("person5Qualifier"));
			System.out.println(context.getBean(Person.class));
			System.out.println(context.getBean(Address.class));
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::print);
		}
	}

}
