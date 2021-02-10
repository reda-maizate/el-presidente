package event;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AnswerList extends ArrayList<Answer> {
	public ArrayList<Answer> answerList = new ArrayList<Answer>();
	
	public AnswerList(ArrayList<Answer> eventList) {
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
			String[] line = scanner.nextLine().split(";"); // on fait le job
			anCurr = an.from(line);
			addToAnswerList(anCurr);
		}
		scanner.close();
	}
	
	@Override
	public String toString() {
		for(Answer a : this.answerList) {
			System.out.println(a.getChoice());
		}
		return "nope";
	}
}
