package event;

public class Answer {
	private String choice;
	
	public Answer() {
	}
	
	public Answer(String choice) {
		this.choice = choice;
	}

	public String getChoice() {
		return choice;
	}

	public void setChoice(String choice) {
		this.choice = choice;
	}
	
	// En attente 
	public Answer from(String[] s) {
		String strEventId = s[0].strip();
		String question = s[1].strip();
		String strType = s[2].strip();

		int eventId = Integer.parseInt(strEventId);
		int type = Integer.parseInt(strType);

		Answer an = new Answer();

		return an;
	}
}
