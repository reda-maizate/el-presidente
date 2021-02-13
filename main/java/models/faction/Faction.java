package models.faction;

public class Faction {
	private String name;
	private int satisfaction;
	private int member;
	
	public Faction() {}
	
	public Faction(String name) {
		this.name = name;
	}

	public int getSatisfaction() {
		return this.satisfaction;
	}
	
	public int getSatisfactionTimesMember() {
		return this.getMember() * this.getSatisfaction();
	}
	
	public void addSatisfaction() {
		if (this.satisfaction > 0) {
			this.satisfaction += satisfaction;
		}
		this.checkMaxSatisfaction();
	}
	
	public void subSatisfaction(int satisfaction) {
		this.satisfaction -= satisfaction;
		this.checkMinSatisfaction();
	}
	
	public void setSatisfaction(int satisfaction) {
		this.satisfaction = satisfaction;
	}

	public int getMember() {
		return this.member;
	}

	public void addMember(int member) {
		if (this.member >= 0) {
			this.member += member;
		}
	}
	
	public void subMember(int members) {
		this.member -= members;
		this.checkMinMember();
	}

	public String getName() {
		return this.name;
	}
	
	public void checkMinSatisfaction() {
		if (this.satisfaction < 0) {
			this.satisfaction = 0;
		}
	}
	
	public void checkMaxSatisfaction() {
		if (this.satisfaction > 100) {
			this.satisfaction = 100;
		}
	}
	
	public void checkMinMember() {
		if (this.member < 0) {
			this.member = 0;
		}
	}
}
