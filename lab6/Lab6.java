import java.util.Scanner;


public class Lab6 {

	public static void main(String[] args) {
		// Author:     Caleb Lewis
		// Assignment: Lab #6
		operatorPractice();
		loopName();
		loopAge();
	}
	
	public static void operatorPractice(){
		double age = 21;
		
		System.out.println("Twice your age is: " + (age * 2 ));
		System.out.println("Three times your age is: " + (age * 3 ));
		System.out.println("Half your age is: " +  (age / 2 ));
		
		double gpa = 3.3;
		
		System.out.println("Half your GPA is: " + (gpa /2));
	}
	
	public static void loopName(){
		String name = "Caleb";
		for (int i = 0; i < 20; i++) {
			System.out.println(name);
		}
	}
	
	public static void loopAge(){
		int age = 21;
		for (int i = 0; i <= age; i++) {
			System.out.println(i);
		}
	}

}
