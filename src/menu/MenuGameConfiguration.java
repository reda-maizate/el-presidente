package menu;

import main.Island;

public class MenuGameConfiguration extends Menu {
	
	public MenuGameConfiguration() {
		super();
	}
	
	
	public Island configureGame() {
		Island island = new Island();
		
		
		
		
		island.setGlobalSatisfaction(10);
		return island;
	}
	
}
