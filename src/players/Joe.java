import java.util.Random;

public class Joe extends Player {
	@Override
	Roshambo getChoice() {
		Random r = new Random();
		switch (r.nextInt(3)) {
			case 0: {
				return Roshambo.ROCK;
			}
			case 1: {
				return Roshambo.PAPER;
			}
			case 2: {
				return Roshambo.SCISSORS;
			}
			default: {
				return null;
			}
		}
	}
	@Override
	String getName() {
		return "Joe";
	}
}