package main;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import event.AnswerList;
import event.EventList;
import menu.MenuDifficulty;
import menu.MenuGameConfiguration;
import menu.MenuMain;

public class Main {
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	MenuMain menuMain = new MenuMain();
	menuMain.setterMenu("Bienvenue sur El-Presidente", new String[] {"D�marrer une partie", "Quitter"});
	menuMain.display(scanner);
	
	MenuDifficulty menuDifficulty = new MenuDifficulty();
	menuDifficulty.setterMenu("Choissisez la difficult� :", new String[] {"Facile", "Normal", "Difficile"});
	int choice_difficulty = menuDifficulty.display(scanner);
	menuDifficulty.chooseDifficulty(choice_difficulty);
	
	MenuGameConfiguration menuGameConfiguration = new MenuGameConfiguration();
	//Island island = new Island();
	//menuGameConfiguration.configeGame();
	
	EventList evL = new EventList();
	AnswerList anL = new AnswerList();
	
	try {
		evL.readFrom(new File("./Data/Event/Autumn.txt"));
		evL.toString();
		
		anL.readFrom(new File("./Data/Answer/AnswerAutumn.txt"));
		anL.toString();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	// Lancer le fichier de configuration initiale d'Island
	}
	
	// TODO : Restructurer les fichiers Answer, parce qu'il contiennent des changements � r�aliser sur Island.
}
