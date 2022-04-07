package Menus;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.InputMismatchException;
import java.util.Scanner;

import DatabaseConnection.ConnectionManager;

public class Menu {

	
	public void welcomeMenu() {
		String id ="";
		String password = "";
		
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Please enter your id: ");
			id = scanner.nextLine();
			
			System.out.print("Please enter your password:");
			password = scanner.nextLine();
			
			System.out.println("you're entering: "+ id + " "+ password);


			// testing connection manager ////////////////////////////////////////////////
			Connection conn = ConnectionManager.getConnection();
			Statement stmt = conn.createStatement(); 

			boolean count = stmt.execute("select * from users");
			System.out.println(count);

			stmt.close();

			
			
		}catch(InputMismatchException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	
	public void trackerPage() {
		//showing user the tracker page; 
		//list all the shows and ask if starting or finishing a show; 
	}
	
	public void trackerOperations(int showNumber) {
		// mark in-progress?
		// mark complete? 
		
	}
}
