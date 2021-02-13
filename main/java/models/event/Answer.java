package models.event;

public class Answer {
	private int answerId;
	private String option;
	
	public Answer() {}
	
	public Answer(int answerId, String option) {
		this.answerId = answerId;
		this.option = option;
	}

	public String getOption() {
		return this.option;
	}

	public void setOption(String option) {
		this.option = option;
	}
	
	public int getAnswerId() {
		return this.answerId;
	}

	public void setAnswerId(int answersId) {
		this.answerId = answersId;
	}
	
	public Answer from(String[] s) {
		String strAnswerId = s[0].strip();
		String option = s[1].strip();

		int answerId = Integer.parseInt(strAnswerId);

		Answer an = new Answer(answerId, option);

		return an;
	}
	
	public int[] getConsequences(String[] s) {
		int[] consequences = new int[19];
		
		for (int i = 2; i <= 20; i++) {
			String strTemp = s[i].strip();
			int temp = Integer.parseInt(strTemp);
			consequences[i-2] = temp;
		}
		
		//System.out.println(consequences[4]);
		
		return consequences;
	}
}
