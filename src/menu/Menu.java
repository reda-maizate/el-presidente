package menu;

import java.util.Scanner;

public class Menu {
	private String[] choices;
	private String title;

	public Menu(String title, String[] choices) {
		this.title = title;
		this.choices = choices;
	}

	public int display(Scanner scanner) {
		System.out.println(title);
		for (int i = 0; i < choices.length; i++) {
			System.out.println(String.format("%d - %s", i + 1, choices[i]));
		}

		NumericInput choiceInput = new NumericInput("> ", 1, choices.length);
		return choiceInput.display(scanner);
	}
	
	public void quit() {
		System.exit(0);
	}
}

