public enum Roshambo {
	ROCK, PAPER, SCISSORS;
	public Result compare(Roshambo other) {
		switch (this) {
			case ROCK: {
				switch (other) {
					case ROCK: {
						return Result.TIE;
					}
					case SCISSORS: {
						return Result.WIN;
					}
					case PAPER: {
						return Result.LOSE;
					}
				}
			}
			case PAPER: {
				switch (other) {
					case PAPER: {
						return Result.TIE;
					}
					case ROCK: {
						return Result.WIN;
					}
					case SCISSORS: {
						return Result.LOSE;
					}
				}
			}
			case SCISSORS: {
				switch (other) {
					case SCISSORS: {
						return Result.TIE;
					}
					case PAPER: {
						return Result.WIN;
					}
					case ROCK: {
						return Result.LOSE;
					}
				}
			}
			default: {
				return Result.TIE;
			}
		}
	}
	@Override
	public String toString() {
		return name().toLowerCase();
	}
}