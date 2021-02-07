package faction;

public class Faction {
	private String name;
	private int approval;
	private int member;
	
	public Faction(String name, int approval, int member) {
		this.name = name;
		this.approval = approval;
		this.member = member;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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
