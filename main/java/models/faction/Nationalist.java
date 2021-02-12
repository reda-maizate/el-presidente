package faction;

public class Nationalist extends Faction {
	
	public Nationalist(int approval, int member) {
		super(approval, member);
	}
	
	public Nationalist() {
		// TODO Auto-generated constructor stub
	}

	public Nationalist from(String[] s) {
		int satisfaction = Integer.parseInt(s[6].strip());
		int member = Integer.parseInt(s[17].strip());
		
		Nationalist nat = new Nationalist(satisfaction, member);
		
		return nat;
	}
}