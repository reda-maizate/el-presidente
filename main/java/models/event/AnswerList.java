package models.event;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AnswerList extends ArrayList<Answer> {
	public ArrayList<Answer> answerList = new ArrayList<Answer>();
	int[] consequences;

	
	public AnswerList(ArrayList<Answer> answerList) {
		this.answerList = answerList;
	}
	
	public AnswerList() {
	}
	
	public void addToAnswerList(Answer an) {
		this.answerList.add(an);
	}
	
	public void readFrom(File file) throws FileNotFoundException {
		Scanner scanner = new Scanner(file);
		Answer an = new Answer();
		Answer anCurr;
		
		while (scanner.hasNext()) {
			String[] line = scanner.nextLine().split(";");
			anCurr = an.from(line);
			addToAnswerList(anCurr);
			consequences = anCurr.getConsequences(line);
		}
		scanner.close();
	}
	
	@Override
	public String toString() {
		for(Answer a : this.answerList) {
			System.out.println(a.getOption() + " / CON : " + consequences[2]);
		}
		return "nope";
	}
}
