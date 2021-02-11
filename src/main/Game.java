package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import faction.Capitalist;
import faction.Communist;
import faction.Ecologist;
import faction.Liberal;
import faction.Loyalist;
import faction.Militarist;
import faction.Nationalist;
import faction.Religious;

public class Game {
	
	private int difficulty;
	Island isl = new Island();
	Capitalist cap = new Capitalist();
	Communist com = new Communist();
	Ecologist eco = new Ecologist();
	Liberal lib = new Liberal();
	Loyalist loy = new Loyalist();
	Militarist mil = new Militarist();
	Nationalist nat = new Nationalist();
	Religious reg = new Religious();
	
	public Game(int difficulty) throws FileNotFoundException {
		this.difficulty = difficulty;
		//configureGame();
		
	}

	public void configureGame() throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("./Data/GameConfiguration/gameConfig.txt"));
		while (scanner.hasNext()) {
			String[] line = scanner.nextLine().split(";");
			isl.from(line);
			cap.from(line);
			com.from(line);
			eco.from(line);
			lib.from(line);
			loy.from(line);
			mil.from(line);
			nat.from(line);
			reg.from(line);
		}
	}

	public int getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}
	
	
	
}
