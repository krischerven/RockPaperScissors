import java.util.Scanner;
import java.util.InputMismatchException;

public class Validator {
	public static boolean confirm(Scanner sc) {
		System.out.println("Would you like to play again? (y/n)");
		while (true) {
			String line = sc.nextLine().toLowerCase().trim();
			if (line.equals("y") || line.equals("yes")) {
				return true;
			} else if (line.equals("n") || line.equals("no")) {
				return false;
			} else {
				System.out.println("Please enter y/n.");
			}
		}
	}
	public static Roshambo getRoshambo(Scanner sc) {
		System.out.println("Rock, paper, or scissors?");
		while (true) {
			String line = sc.nextLine().toLowerCase().trim();
			if (line.equals("rock")) {
				return Roshambo.ROCK;
			} else if (line.equals("paper")) {
				return Roshambo.PAPER;
			} else if (line.equals("scissors")) {
				return Roshambo.SCISSORS;
			} else {
				System.out.println("Please enter rock, paper, or scissors.");
			}
		}
	}
	public static Player getOpponent(Scanner sc, Player rocky, Player joe) {
		System.out.println("Do you want to play against Rocky (1) or Joe (2)?");
		while (true) {
			try {
				int choice = sc.nextInt();
				sc.nextLine(); // garbage line;
				switch (choice) {
					case 1: {
						return rocky;
					}
					case 2: {
						return joe;
					}
					default: {
						System.out.println("Please enter 1 (Rocky) or 2 (Joe).");
						break;
					}
				}
			} catch (InputMismatchException e) {
				System.out.println("Please enter 1 (Rocky) or 2 (Joe).");
				sc.nextLine();
			}
		}
	}
}