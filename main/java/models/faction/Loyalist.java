package faction;

public class Loyalist extends Faction {
	
	public Loyalist(int approval, int member) {
		super(approval, member);
	}
	
	public Loyalist() {
		// TODO Auto-generated constructor stub
	}

	public Loyalist from(String[] s) {
		int satisfaction = Integer.parseInt(s[4].strip());
		int member = Integer.parseInt(s[15].strip());
		
		Loyalist loy = new Loyalist(satisfaction, member);
		
		return loy;
	}
}