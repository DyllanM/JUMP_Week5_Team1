package Menus;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.InputMismatchException;
import java.util.Scanner;

import DatabaseConnection.ConnectionManager;

public class Menu {

	protected boolean running = true;
	private Scanner scanner;
	
	Menu()
	{
		scanner = new Scanner(System.in);
	}
	
	public void welcomeMenu() {
		String id ="";
		String password = "";
		
		
		System.out.print("Please enter your id: ");
		id = scanner.nextLine();
		
		System.out.print("Please enter your password:");
		password = scanner.nextLine();
		
		System.out.println("you're entering: "+ id + " "+ password);
			/////////////////// ADD ACTUAL LOGIN CHECK ///////////////////////////////




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
			
			System.out.print("Enter ID of show to begin watching: ");
			showInput = scanner.nextInt();
			System.out.println("\n");

			break;
			
		case "2":
			//display in progress shows
			//input show id 
			//mark that show as finished
			
			System.out.print("Enter ID of show to finish watching: ");
			showInput = scanner.nextInt();
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
