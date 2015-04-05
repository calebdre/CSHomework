import java.util.Scanner;


public class GuessME {

	public static void main(String[] args) {
		// Author: Caleb Lewis
		// Assignment: Homework #6
		
		System.out.println("Welcome to the number guessing game where you will guess a number between 1 and 100");
		
		Scanner scanner = new Scanner(System.in);
		int rand = (int)(Math.random() * 100);
		int attempts = 10;
		
		while(true){
			
			if (attempts == 0){
				loser(rand);
				break;
			}else{
				attempts--;
			}
			
			int input = scanner.nextInt();
			if(input > rand){
				System.out.println("Too high! Guess again. (attempt left: " + attempts + ")");
			}else if(input < rand && attempts != 0){
				 System.out.println("Too low! Guess again. (attempt left: " + attempts + ")");
			}else if(input == rand){
				winner((10 - attempts));
				break;
			}
		}
	}
	
	public static void winner(int attempts){
		System.out.println("Winner winner chicken dinner! And it only took " + attempts + " tries");
	}
	
	public static void loser(int rand){
		System.out.println("You lost, sorry. The number was " + rand);
	}

}
