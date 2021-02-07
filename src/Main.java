import java.util.Scanner;

import menu.MenuMain;

public class Main {
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	MenuMain menuMain = new MenuMain("Bienvenue sur El-Presidente", new String[] {"Démarrer une partie", "Quitter"});
	
	menuMain.welcome(scanner);
	menuMain.chooseDifficulty(scanner);
	
	}
}
