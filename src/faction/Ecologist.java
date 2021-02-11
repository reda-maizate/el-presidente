package faction;

public class Ecologist extends Faction {
	
	public Ecologist() {
		// TODO Auto-generated constructor stub
	}
	
	public Ecologist(int approval, int member) {
		super(approval, member);
	}
	
	public Ecologist from(String[] s) {
		int satisfaction = Integer.parseInt(s[2].strip());
		int member = Integer.parseInt(s[13].strip());
		
		Ecologist eco = new Ecologist(satisfaction, member);
		
		return eco;
	}
}