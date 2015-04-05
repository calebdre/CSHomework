import java.util.Scanner;


public class payroll {

	public static void main(String[] args) {
		
		// Author: Caleb Lewis
		// Assignment: Homework #4
		
		System.out.println("Please enter the information about the employee to get their payroll information.");
		Scanner scanner = new Scanner(System.in);
		
		String name = prompt("Employee's name: ", scanner);
		double hoursWorked = Double.parseDouble(prompt("Number of hours worked: ", scanner));
		double payRate = Double.parseDouble(prompt("Hourly rate of pay: ", scanner));
		double taxRate = Double.parseDouble(prompt("Federal tax rate: ", scanner));
		
		double grossPay = multiply(hoursWorked, payRate);
		double taxDeducted = multiply(taxRate, grossPay);
		
		System.out.println("That's all! Here is " + name + "'s payroll information:");
		System.out.println();
		
		System.out.println("Employee's name:    " + name);
		System.out.println(" Hours worked:    " + hoursWorked);
		System.out.println("  Hourly rate:    " + payRate);
		System.out.println("    Gross pay:    " + grossPay);
		System.out.println(" Tax deducted:    " + taxDeducted);
		System.out.println("      Net pay:    " + (grossPay - taxDeducted));
		
	}
	
	public static String prompt(String message, Scanner scan){
		System.out.print(message);
		String s = scan.nextLine();
		System.out.println();
		return s;
	}
	
	public static double multiply(double num1, double num2){
		return num1 * num2;
	}
}
