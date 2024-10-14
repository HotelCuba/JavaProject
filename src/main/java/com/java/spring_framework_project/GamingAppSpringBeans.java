package com.java.spring_framework_project;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.java.spring_framework_project.game.GameRunner;
import com.java.spring_framework_project.game.GamingConsole;

public class GamingAppSpringBeans {
	
	public static void main(String[] args) {
		
		try(var context = 
				new AnnotationConfigApplicationContext(GamingConfiguration.class);) {
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}
	}
}	