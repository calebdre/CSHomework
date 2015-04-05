import java.util.Scanner;


public class DigitPrinter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please type in an integer and i'll tell you how many digits it has.");
		int number = scanner.nextInt();
		
		int  digits = 0;
		
		while(true){
			if(number <= 0){
				break;
			}
			number = (number / 10);
			
			digits++;
		}
		
		System.out.println("The number of digits in the number is: " + digits);
	}

}
