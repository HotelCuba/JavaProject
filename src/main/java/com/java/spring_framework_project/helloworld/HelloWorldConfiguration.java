package com.java.spring_framework_project.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {};
record Address(String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name() {
		return "Yohan";
	}
	
	@Bean
	public int age() {
		return 30;
	}
	
	@Bean
	public Person person() {
		return new Person("Garam", 34, new Address("Julius-Brecht-Strasse", "Schwalbach am Taunus"));
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address());
	}
	
	@Bean
	public Person person3Parameters(String name, int age, Address address2) {
		return new Person(name, age, address2);
	}
	
	@Bean
	@Primary
	public Person person4Parameters(String name, int age, Address address) {
		return new Person(name, age, address);
	}
	
	@Bean
	public Person person5Qualifier(String name, int age, @Qualifier("address2qualifier") Address address) {
		return new Person(name, age, address);
	}
	
	@Bean(name = "myAddress")
	@Primary
	public Address address() {
		return new Address("Julius-Brecht-Strasse", "Schwalbach am Taunus");
	}
	
	@Bean(name = "address2")
	@Qualifier("address2qualifier")
	public Address address2() {
		return new Address("Cheonho", "Seoul");
	}
}
