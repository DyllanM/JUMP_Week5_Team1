package Menus;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import DatabaseConnection.*;

import Exceptions.LoginInvalidException;

public class Menu {

	protected boolean running = true;
	private Scanner scanner;

	TrackerSql trackersql;
	UserSql usersql;
	ShowsSql showsql;
	
	int userID = -1;
	
	Menu(){
		scanner = new Scanner(System.in);
		
		trackersql = new TrackerSql();
		usersql = new UserSql();
		showsql = new ShowsSql();
	}
	
	public void welcomeMenu() throws LoginInvalidException{
		String username = "";
		String password = "";
		
		
		System.out.print("Please enter your username: ");
		username = scanner.nextLine();
		System.out.print("Please enter your password:");
		password = scanner.nextLine();
		
		User response = usersql.getUserByNamePassword(username, password);
		
		if(response == null)
		{
			throw new LoginInvalidException("test");
		}
		
		userID = response.getId();
		
	}
		
	
	public void trackerPage() {
		//showing user the tracker page; 
		//list all the shows and ask if starting or finishing a show; 
		String input;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Option 1: Start a show");
		System.out.println("Option 2: Finish a show");
		System.out.println("Option 3: Exit Program");

		System.out.print("Enter Option: ");
		input = scanner.nextLine();
		System.out.println("\n");
		
		int showInput = -1;
		
		switch(input)
		{
		case "1":
			//display unstarted shows
			//input show id 
			//mark that show as in progress
			
			List<Integer> showList = trackersql.getShowIdByUserId(userID);
			for(Integer i : showList)
			{
				System.out.println(showsql.getShowsById(i));
			}
			
			System.out.print("Enter ID of show to begin watching: ");
			showInput = scanner.nextInt();
			
			trackersql.updateTrackerStatusByShowId("PRO", showInput);
			System.out.println("\n");

			break;
			
		case "2":
			//display in progress shows
			//input show id 
			//mark that show as finished
			
			List<Integer> showList2 = trackersql.getShowIdByUserId(userID);
			for(Integer i : showList2)
			{
				System.out.println(showsql.getShowsById(i));
			}
			
			System.out.print("Enter ID of show to finish watching: ");
			showInput = scanner.nextInt();
			
			trackersql.updateTrackerStatusByShowId("COM", showInput);
			System.out.println("\n");

			break;
			
		case "3":
			running = false;
			System.out.println("\n\nExiting Program...\n\n");
			scanner.close();
			break;
			
		default:
			System.out.println("Invalid Input!!\n\n");
		}
		
		
		
		
	}
	
	public void trackerOperations(int showNumber) {
		// mark in-progress?
		// mark complete? 
		
		// display show list: unstarted if 1, in progress if 2
		// take ID and mark show depending on showNumber
		
		System.out.println("Track " + showNumber);
		
	}
}
