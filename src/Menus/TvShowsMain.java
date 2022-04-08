package Menus;

public class TvShowsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Menu menu = new Menu();
		menu.welcomeMenu();
		
		while (menu.running)
			menu.trackerPage();
	}

}
