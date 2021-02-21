package menu;

public class MenuMain extends Menu {
	
	public MenuMain() {
		super();
	}
	
	public void action(int choice) {
		if (choice == 2) {
			quit();
		}
	}
}
