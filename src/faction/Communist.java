package faction;

public class Communist extends Faction {
	
	public Communist() {
		// TODO Auto-generated constructor stub
	}
	
	public Communist(int approval, int member) {
		super(approval, member);
	}
	
	public Communist from(String[] s) {
		int satisfaction = Integer.parseInt(s[1].strip());
		int member = Integer.parseInt(s[12].strip());
		
		Communist com = new Communist(satisfaction, member);
		
		return com;
	}
}