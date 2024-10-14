package com.java.spring_framework_project.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("PacManGameQualifer")
public class PacManGame implements GamingConsole{
	
	public void up() {
		System.out.println("Up");
	}
	
	public void down() {
		System.out.println("Down");
	}
	
	public void right() {
		System.out.println("Right");
	}
	
	public void left() {
		System.out.println("Left");
	}
}
