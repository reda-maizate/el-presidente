package faction;

public class Liberal extends Faction {
	
	public Liberal() {
		// TODO Auto-generated constructor stub
	}
	
	public Liberal(int approval, int member) {
		super(approval, member);
	}
	
	public Liberal from(String[] s) {
		int satisfaction = Integer.parseInt(s[3].strip());
		int member = Integer.parseInt(s[14].strip());
		
		Liberal lib = new Liberal(satisfaction, member);
		
		return lib;
	}
}