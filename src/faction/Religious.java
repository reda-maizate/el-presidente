package faction;

public class Religious extends Faction {
	
	public Religious(int approval, int member) {
		super(approval, member);
	}
	
	public Religious() {
		// TODO Auto-generated constructor stub
	}

	public Religious from(String[] s) {
		int satisfaction = Integer.parseInt(s[7].strip());
		int member = Integer.parseInt(s[18].strip());
		
		Religious reg = new Religious(satisfaction, member);
		
		return reg;
	}
}