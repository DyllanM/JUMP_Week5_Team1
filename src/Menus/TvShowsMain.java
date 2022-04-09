package Menus;

import DatabaseConnection.ConnectionManager;
import DatabaseConnection.ShowsSql;
import DatabaseConnection.TrackerSql;

public class TvShowsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Menu menu = new Menu();
//		menu.welcomeMenu();
//		
//		while (menu.running)
//			menu.trackerPage();
//		
//		ConnectionManager.getConnection();
		
//		get all the records from table shows in Mysql; 
//		
		
		TrackerSql trackersql = new TrackerSql();
//		System.out.println(trackersql.getShowIdByUserId(2));
		System.out.print(trackersql.updateTrackerStatusByShowId("PRO", 12));
//		
//		ShowsSql showssql = new ShowsSql();
//		System.out.println(showssql.getShowsById(2));
		
		
		
		
		
	}
	

}
