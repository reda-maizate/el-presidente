package main;
import java.io.IOException;
import java.util.Scanner;

import menu.MenuDifficulty;
import menu.MenuMain;
import service.Game;

public class Main {
	
	public static void main(String[] args) throws IOException {
	Scanner scanner = new Scanner(System.in);
	
	MenuMain menuMain = new MenuMain();
	menuMain.setterMenu("Bienvenue sur El-Presidente", new String[] {"Démarrer une partie", "Quitter"});
	int choice = menuMain.display(scanner);
	menuMain.action(choice);
	
	MenuDifficulty menuDifficulty = new MenuDifficulty();
	menuDifficulty.setterMenu("Choissisez la difficulté :", new String[] {"Facile", "Normal", "Difficile"});
	int choice_difficulty = menuDifficulty.display(scanner);
	int difficulty = menuDifficulty.chooseDifficulty(choice_difficulty);
	
	new Game(difficulty);
	}
}
