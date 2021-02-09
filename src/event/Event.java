package event;

public class Event {
	private int eventId;
	private String question;
	private int answersId;
	private int type;
	
	public Event() {}
	
	public Event(int eventId, String question, int answersId, int type) {
		this.eventId = eventId;
		this.question = question;
		this.answersId = answersId;
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

	public int getAnswersId() {
		return this.answersId;
	}

	public void getAnswersId(int answersId) {
		this.answersId = answersId;
	}

	public Event from(String[] s) {
		String strEventId = s[0].strip();
		String question = s[1].strip();
		String strType = s[2].strip();

		int eventId = Integer.parseInt(strEventId);
		int type = Integer.parseInt(strType);

		Event ev = new Event(eventId, question, eventId, type);

		return ev;
	}

	public int getEventId() {
		return this.eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
}
