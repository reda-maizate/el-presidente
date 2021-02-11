package faction;

import main.Island;

public class Faction {
	private int approval;
	private int member;
	
	public Faction() {}
	
	public Faction(int approval, int member) {
		this.approval = approval;
		this.member = member;
	}

	public int getApproval() {
		return this.approval;
	}

	public void setApproval(int approval) {
		this.approval = approval;
	}

	public int getMember() {
		return this.member;
	}

	public void setMember(int member) {
		this.member = member;
	}
	
}
