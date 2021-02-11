package main;
import java.io.FileNotFoundException;
import java.util.Scanner;

import menu.MenuDifficulty;
import menu.MenuMain;

public class Main {
	
	public static void main(String[] args) throws FileNotFoundException {
	Scanner scanner = new Scanner(System.in);
	
	MenuMain menuMain = new MenuMain();
	menuMain.setterMenu("Bienvenue sur El-Presidente", new String[] {"Démarrer une partie", "Quitter"});
	menuMain.display(scanner);
	
	MenuDifficulty menuDifficulty = new MenuDifficulty();
	menuDifficulty.setterMenu("Choissisez la difficulté :", new String[] {"Facile", "Normal", "Difficile"});
	int choice_difficulty = menuDifficulty.display(scanner);
	int difficulty = menuDifficulty.chooseDifficulty(choice_difficulty);
	
	Game game = new Game(difficulty);
		
	// Lancer le fichier de configuration initiale d'Island
	}
	
	// TODO : Restructurer les fichiers Answer, parce qu'il contiennent des changements à réaliser sur Island.
}
