package Menus;

import DatabaseConnection.ConnectionManager;
import DatabaseConnection.ShowsSql;
import DatabaseConnection.TrackerSql;
import DatabaseConnection.UserSql;

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
		
//		TrackerSql trackersql = new TrackerSql();
//		System.out.println(trackersql.getShowIdByUserId(2));
//		System.out.print(trackersql.updateTrackerStatusByShowId("PRO", 12));
//		
//		ShowsSql showssql = new ShowsSql();
//		System.out.println(showssql.getShowsById(2));
		
		UserSql userSql = new UserSql();
	
		System.out.println(userSql.getUserByIdNPassword(1, "ro3ot"));
		System.out.println(userSql.getUserByIdNPassword(5, "root"));
		System.out.println(userSql.getUserByIdNPassword(2, "root"));
		
		
	}
	

}
