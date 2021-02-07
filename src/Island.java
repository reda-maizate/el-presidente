

public class Island {
	private int pctAgriculture;
	private int pctIndustry;
	private int treasure;
	private int globalSatisfaction;
	private int difficulty;
	private int foodUnity;
	private int industryUnity;

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
	
	

}
