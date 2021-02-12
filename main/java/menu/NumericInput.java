package menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumericInput {
	private int min, max;
	private String prompt;

	public NumericInput(String prompt, int min, int max) {
		this.prompt = prompt;
		this.min = min;
		this.max = max;
	}

	public int display(Scanner scanner) {
		int choice = 0;
		boolean loop = true;

		while (loop) {
			try {
				System.out.print(prompt);
				choice = scanner.nextInt();
				loop = choice < min || choice > max;
			} catch (InputMismatchException e) {
				scanner.next(); 
				loop = true;
			}

			if (loop) {
				System.out.println(String.format("Saisissez un chiffre entre %d et %d", min, max));
			}
		}

		return choice;
	}
}
