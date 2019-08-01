import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final Roshambo rock = Roshambo.ROCK;
		final Roshambo paper = Roshambo.PAPER;
		final Roshambo scissors = Roshambo.SCISSORS;
		int wins = 0;
		int losses = 0;
		int ties = 0;
		do {
			Player opponent = Validator.getOpponent(sc, new Rocky(), new Joe());
			Roshambo choice = Validator.getRoshambo(sc);
			Roshambo otherChoice = opponent.getChoice();
			switch (choice.compare(otherChoice)) {
				case WIN: {
					System.out.println(opponent.getName() + " rolled " + otherChoice + ". You win!");
					++wins;
					break;
				}
				case LOSE: {
					System.out.println(opponent.getName() + " rolled " + otherChoice + ". You lose!");
					++losses;
					break;
				}
				case TIE: {
					System.out.println(opponent.getName() + " rolled " + otherChoice + ". You tie!");
					++ties;
					break;
				}
			}
		} while (Validator.confirm(sc));
		System.out.println("Wins: " + wins);
		System.out.println("Losses: " + losses);
		System.out.println("Ties: " + ties);
	}
}