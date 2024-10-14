package com.java.spring_framework_project;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.java.spring_framework_project.game.MarioGame;
import com.java.spring_framework_project.game.PacManGame;
import com.java.spring_framework_project.game.SuperContraGame;
import com.java.spring_framework_project.game.GameRunner;
import com.java.spring_framework_project.game.GamingConsole;

@Configuration
public class GamingConfiguration {
	
	@Bean
	public GamingConsole game() {
		var game = new PacManGame();
		return game;
	}
	
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}
}