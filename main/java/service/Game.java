package service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import models.main.Island;
import models.faction.Faction;

public class Game {
	
	private int difficulty;

	ArrayList<Faction> factions;
	
	public Game(int difficulty) throws FileNotFoundException {
		this.difficulty = difficulty;
		
		this.configureGame();
	}

	public void configureGame() throws FileNotFoundException {		
		
	}

	public int getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}
	
	
	
}
