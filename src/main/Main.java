package main;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import event.AnswerList;
import event.EventList;
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
		
	EventList evL = new EventList();
	AnswerList anL = new AnswerList();
	
	try {
		evL.readFrom(new File("./Data/Event/Autumn.txt"));
		//evL.toString(); 
		
		anL.readFrom(new File("./Data/Answer/AnswerAutumn.txt"));
		//anL.toString();
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	// Lancer le fichier de configuration initiale d'Island
	}
	
	// TODO : Restructurer les fichiers Answer, parce qu'il contiennent des changements à réaliser sur Island.
}
