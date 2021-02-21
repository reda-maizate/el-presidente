package models.event;

import java.io.IOException;

public class Event {
	private int eventId;
	private String question;
	private int type;
	private AnswerList answers;
	
	public Event() {}
	
	public Event(int eventId, String question, int type, AnswerList answers) {
		this.eventId = eventId;
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

	public AnswerList getAnswers() {
		return this.answers;
	}

	public void getAnswers(AnswerList answers) {
		this.answers = answers;
	}

	public Event from(String[] s) throws IOException {
		String strEventId = s[0].strip();
		String question = s[1].strip();
		String strType = s[2].strip();
		
		int eventId = Integer.parseInt(strEventId);
		int type = Integer.parseInt(strType);
		
		AnswerList answers = new AnswerList();
		answers.getAnswersByAnswerId(eventId);

		Event ev = new Event(eventId, question, type, answers);

		return ev;
	}

	public int getEventId() {
		return this.eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
}
