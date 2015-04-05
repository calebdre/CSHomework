import java.util.Scanner;


public class ICalledyou {

	public static void main(String[] args) {
		// Author: Caleb Lewis
		// Assignment: Homework #4
		
		product();
		max();
	}
	
	public static void product() {
		System.out.println("Type in two numbers to find out the result");
		
		Scanner scanner = new Scanner(System.in);
		
		double num1 = Double.parseDouble(prompt("First number: ", scanner));
		double num2 = Double.parseDouble(prompt("Second number: ", scanner));
		
		double result = num1 * num2;
		
		System.out.println("Product is: " + result);
	}
	

	public static void max() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers and find out which one of them is bigger.");
		double max1 = Double.parseDouble(prompt("First number: ", scanner));
		double max2 = Double.parseDouble(prompt("Second number: ", scanner));
		
		System.out.println("Max is: " + Math.max(max1, max2));
	}
	
	public static String prompt(String message, Scanner scanner){
		System.out.print(message);
		return scanner.nextLine();
	}

}
