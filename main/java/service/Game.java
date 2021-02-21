package service;

import java.io.IOException;
import java.util.ArrayList;

import models.faction.Faction;

public class Game {
	
	ArrayList<Faction> factions;
	
	public Game(int difficulty) throws IOException {
		this.initGame();
	}

	public void initGame() throws IOException {		
		new GameConfig();
	}	
}
