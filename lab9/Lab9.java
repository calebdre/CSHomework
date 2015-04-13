import java.util.Scanner;


public class Lab9 {

	public static void main(String[] args) {
		// Author: Caleb Lewis
		// Assignment: Lab 9
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your first and last name:");
		
		String name = scanner.nextLine();
		int space = name.indexOf(" ");
		String formatteed = name.substring(space) + ", " + name.substring(0, space);
		
		System.out.println("Your name for out system will be " + formatteed);
	}

}
