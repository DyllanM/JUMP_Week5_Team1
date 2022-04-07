package Menus;

import java.util.InputMismatchException;
import java.util.Scanner;

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
			System.exit(0);
			
		}catch(InputMismatchException e) {
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
