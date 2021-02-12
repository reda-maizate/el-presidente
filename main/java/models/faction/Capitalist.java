package faction;

public class Capitalist extends Faction {
	
	public Capitalist() {
		// TODO Auto-generated constructor stub
	}
	
	public Capitalist(int approval, int member) {
		super(approval, member);
	}
	
	public Capitalist from(String[] s) {
		int satisfaction = Integer.parseInt(s[0].strip());
		int member = Integer.parseInt(s[11].strip());
		
		Capitalist cap = new Capitalist(satisfaction, member);
		
		return cap;
	}
}
