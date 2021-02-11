package event;

public class Answer {
	private int answerId;
	private String option;
	
	public Answer() {}
	
	public Answer(int answertId, String option) {
		this.answerId = answertId;
		this.option = option;
	}

	public String getOption() {
		return this.option;
	}

	public void setOption(String option) {
		this.option = option;
	}
	
	public int getAnswersId() {
		return this.answerId;
	}

	public void getAnswersId(int answersId) {
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
		
		/*String capitalistSatisfaction = s[2].strip();
		String communistSatisfaction = s[3].strip();
		String ecologistSatisfaction = s[4].strip();
		String liberalSatisfaction = s[5].strip();
		String loyalistSatisfaction = s[6].strip();
		String militaristSatisfaction = s[7].strip();
		String nationalistSatisfaction = s[8].strip();
		String religiousSatisfaction = s[9].strip();
		String pctAgriculture = s[10].strip();
		String pctIndustry = s[11].strip();
		String treasure = s[12].strip();
		String capitalistMember = s[13].strip();
		String communistMember = s[14].strip();
		String ecologistMember = s[15].strip();
		String liberalMember = s[16].strip();
		String loyalistMember = s[17].strip();
		String militaristMember = s[18].strip();
		String nationalistMember = s[19].strip();
		String religiousMember = s[20].strip();*/
		
		return consequences;
	}
}
