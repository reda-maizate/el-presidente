package event;

public class Answer {
	private int answerId;
	private String question;
	
	public Answer() {}
	
	public Answer(int answertId, String question) {
		this.answerId = answertId;
		this.question = question;
	}

	public String getQuestion() {
		return this.question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}
	
	public int getAnswersId() {
		return this.answerId;
	}

	public void getAnswersId(int answersId) {
		this.answerId = answersId;
	}
	
	// En attente 
	public Answer from(String[] s) {
		String strAnswerId = s[0].strip();
		String question = s[1].strip();

		int answerId = Integer.parseInt(strAnswerId);

		Answer an = new Answer();

		return an;
	}
}
