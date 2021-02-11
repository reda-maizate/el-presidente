package main;

import event.Event;

public class Island {
	private int pctAgriculture;
	private int pctIndustry;
	private int treasure;
	private int globalSatisfaction;
	private int difficulty;
	private int foodUnity;
	private int industryUnity;

	public Island() {}

	public Island(int pctAgriculture, int pctIndustry, int treasure, int globalSatisfaction, int difficulty, int foodUnity, int industryUnity) {
		this.pctAgriculture = pctAgriculture;
		this.pctIndustry = pctIndustry;
		this.treasure = treasure;
		this.globalSatisfaction = globalSatisfaction;
		this.difficulty = difficulty;
		this.foodUnity = foodUnity;
		this.industryUnity = industryUnity;
	}

	public int getPctAgriculture() {
		return this.pctAgriculture;
	}

	public void setPctAgriculture(int pctAgriculture) {
		this.pctAgriculture = pctAgriculture;
	}

	public int getPctIndustry() {
		return this.pctIndustry;
	}

	public void setPctIndustry(int pctIndustry) {
		this.pctIndustry = pctIndustry;
	}

	public int getTreasure() {
		return this.treasure;
	}

	public void setTreasure(int treasure) {
		this.treasure = treasure;
	}

	public int getGlobalSatisfaction() {
		return this.globalSatisfaction;
	}

	public void setGlobalSatisfaction(int globalSatisfaction) {
		this.globalSatisfaction = globalSatisfaction;
	}

	public int getDifficulty() {
		return this.difficulty;
	}

	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}

	public int getFoodUnity() {
		return this.foodUnity;
	}

	public void setFoodUnity(int foodUnity) {
		this.foodUnity = foodUnity;
	}

	public int getIndustryUnity() {
		return this.industryUnity;
	}

	public void setIndustryUnity(int industryUnity) {
		this.industryUnity = industryUnity;
	}
	public Island from(String[] s) {
		
		int capitalistSatisfaction = Integer.parseInt(s[0].strip());
		int communistSatisfaction = Integer.parseInt(s[1].strip());
		int ecologistSatisfaction = Integer.parseInt(s[2].strip());
		int liberalSatisfaction = Integer.parseInt(s[3].strip());
		int loyalistSatisfaction = Integer.parseInt(s[4].strip());
		int militaristSatisfaction = Integer.parseInt(s[5].strip());
        int nationalistSatisfaction = Integer.parseInt(s[6].strip());
        int religiousSatisfaction = Integer.parseInt(s[7].strip());
        int pctAgriculture = Integer.parseInt(s[8].strip());
        int pctIndustry = Integer.parseInt(s[9].strip());
        int treasure = Integer.parseInt(s[10].strip());
        int capitalistMember = Integer.parseInt(s[11].strip());
        int communistMember = Integer.parseInt(s[12].strip());
        int ecologistMember = Integer.parseInt(s[13].strip());
        int liberalMember = Integer.parseInt(s[14].strip());
        int loyalistMember = Integer.parseInt(s[15].strip());
        int militaristMember = Integer.parseInt(s[16].strip());
        int nationalistMember = Integer.parseInt(s[17].strip());
        int religiousMember = Integer.parseInt(s[18].strip());
		

		int eventId = Integer.parseInt(strEventId);
		int type = Integer.parseInt(strType);

		Island islan = new Event(eventId, question, eventId, type);

		return island;
	}
	

}
