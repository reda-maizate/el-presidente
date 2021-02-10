package main;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import event.EventList;
import menu.MenuDifficulty;
import menu.MenuMain;

public class Main {
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	MenuMain menuMain = new MenuMain();
	menuMain.setterMenu("Bienvenue sur El-Presidente", new String[] {"Démarrer une partie", "Quitter"});
	menuMain.display(scanner);
	
	MenuDifficulty menuDifficulty = new MenuDifficulty();
	menuDifficulty.setterMenu("Choissisez la difficulté :", new String[] {"Facile", "Normal", "Difficile"});
	int choice_difficulty = menuDifficulty.display(scanner);
	menuDifficulty.chooseDifficulty(choice_difficulty);
	
	EventList evL = new EventList();
	try {
		evL.readFrom(new File("./Data/Event/Autumn.txt"));
		evL.toString();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	// Lancer le fichier de configuration initiale d'Island
	}
	
	// TODO : Restructurer les fichiers Answer, parce qu'il contiennent des changements à réaliser sur Island.
}
