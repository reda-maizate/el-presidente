package faction;

public class Militarist extends Faction {
	
	public Militarist(int approval, int member) {
		super(approval, member);
	}
	
	public Militarist() {
		// TODO Auto-generated constructor stub
	}

	public Militarist from(String[] s) {
		int satisfaction = Integer.parseInt(s[5].strip());
		int member = Integer.parseInt(s[16].strip());
		
		Militarist mil = new Militarist(satisfaction, member);
		
		return mil;
	}
}