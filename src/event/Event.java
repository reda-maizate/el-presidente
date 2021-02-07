package event;


public class Event {
	private String question;
	private Answer[] answers;
	private int type;
	
	public Event(String question, Answer[] answers, int type) {
		this.question = question;
		this.answers = answers;
		this.type = type;
	}

	public String getQuestion() {
		return this.question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public Answer[] getAnswers() {
		return this.answers;
	}

	public void setAnswers(Answer[] answers) {
		this.answers = answers;
	}
}
