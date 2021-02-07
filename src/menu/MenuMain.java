package menu;

import java.util.Scanner;

public class MenuMain extends Menu {
	
	public MenuMain(String title, String[] choices) {
		super(title, choices);
	}
	
	public void welcome(Scanner scanner) {
	int choice = display(scanner);
	
	switch (choice) {
		case 1:
			chooseDifficulty(scanner);
			break;
		case 2:
			quit();
		}
	}
	
	public void chooseDifficulty(Scanner scanner) {
		int choice = display(scanner);
		
		switch (choice) {
			case 1:
				// Niveau facile
				break;
			case 2:
				// Niveau moyen
				break;
			case 3:
				// Niveau difficile
				break;
			case 4:
				quit();
			}
	}
}
