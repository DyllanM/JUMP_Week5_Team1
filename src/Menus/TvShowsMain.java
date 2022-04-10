package Menus;

import DatabaseConnection.ConnectionManager;
import DatabaseConnection.ShowsSql;
import DatabaseConnection.TrackerSql;
import DatabaseConnection.UserSql;
import Exceptions.LoginInvalidException;

public class TvShowsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu menu = new Menu();
		try
		{
			menu.welcomeMenu();
		}
		catch(LoginInvalidException e)
		{
			return;
		}
		
		while (menu.running)
			menu.trackerPage();
		
		//get all the records from table shows in Mysql; 
		
//		System.out.println("\nChunk 1");
//		TrackerSql trackersql = new TrackerSql();
//		System.out.println(trackersql.getShowIdByUserId(2));
//		System.out.println(trackersql.updateTrackerStatusByShowId("PRO", 12));
//
//		System.out.println("\nChunk 2");
//		ShowsSql showssql = new ShowsSql();
//		System.out.println(showssql.getShowsById(2));
//
//		System.out.println("\nChunk 3");
//		UserSql userSql = new UserSql();
//		System.out.println(userSql.getUserByIdNPassword(1, "ro3ot"));
//		System.out.println(userSql.getUserByIdNPassword(5, "root"));
//		System.out.println(userSql.getUserByIdNPassword(2, "root"));
//		
//		System.out.println(userSql.getUserByNamePassword("ying", "root"));
		
		
	}
	

}
