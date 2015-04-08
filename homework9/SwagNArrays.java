import java.util.Scanner;

public class SwagNArrays {

	public static void main(String[] args) {
		// Author: Caleb Lewis
		// Assignment: Homework 9
		
		System.out.println("Please enter 10 numbers");
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[10];
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Enter a number: ");
			numbers[i] = scanner.nextInt();
		}
		
		printReverse(numbers);
		
		System.out.println("The numbers total up to: " + computeTotal(numbers));
	
		System.out.println("The highest number is: " + getLargest(numbers));

	}
	
	public static void printReverse(int[] numbers){
		int[] reversed = new int[numbers.length];
		
		for (int i = 0; i < numbers.length; i++) {
			reversed[i] = numbers[(numbers.length - 1) - i]; 
		}
		
		System.out.print("Your numbers reversed are: ");
		
		for (int i = 0; i < reversed.length; i++) {
			System.out.print(reversed[i]);
			if (i != (reversed.length - 1)) {
				System.out.print(", ");
			}
		}
		
		System.out.println();
	}
	
	public static int computeTotal(int[] numbers){
		int sum = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		
		return sum;
	}
	
	public static int getLargest(int[] numbers){
		int max = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			max = Math.max(max, numbers[i]);
		}	
		
		return max;
	}

}
