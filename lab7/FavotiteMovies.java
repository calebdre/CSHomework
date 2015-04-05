import java.util.Scanner;


public class FavotiteMovies {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String movies = "";
		for (int i = 0; i < 10; i++) {
			System.out.print("Please type in your favorite Movie: ");
			String movie = scanner.nextLine();
			movies += (movie + "\t" + " ");
		}
		
		System.out.println("Your favorite movies are: " + movies);

	}

}
