package com.java.spring_framework_project.game;

public class GameRunner {
	private GamingConsole game;
	
	public GameRunner(GamingConsole game)
	{
		this.game = game;
	}

	public void run() {
		System.out.println("Running Game: " + game);
		game.up();
		game.down();
		game.right();
		game.left();
	}
}
