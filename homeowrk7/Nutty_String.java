import java.util.Scanner;

public class Nutty_String {

	public static void main(String[] args) {
		// Author: Caleb Lewis
		// Assignment: Homework #7
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("What's your name?");
		String name = scanner.next().toLowerCase();
		System.out.println("Your name: " + name);
		
		printReverse(name);
		printNickName(name);
		printPyramid(name);
	}
	
	public static void printReverse(String subject){
		// spoke to the professor about using the StringBuilder class. He said it was okay.
		StringBuilder reversed = new StringBuilder().append(subject).reverse();
		System.out.println("Your name reversed is: " + reversed.toString());
	}
	
	public static void printNickName(String subject){
		System.out.println("Your nickname is: " + subject.substring(0, 2) + subject.substring(subject.length() - 2));
	}
	
	public static void printPyramid(String subject){
		System.out.println("Here's a pyramid of your name: ");
		for (int i = 0; i < subject.length(); i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(subject.charAt(i));
			}
			System.out.println();
		}
	}

}
