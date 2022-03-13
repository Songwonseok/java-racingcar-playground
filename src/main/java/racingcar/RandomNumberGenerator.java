package racingcar;

import java.util.Random;

public class RandomNumberGenerator implements NumberGenerator{
	private static final Random random = new Random();

	@Override
	public int generateNumber() {
		return random.nextInt(MAX + 1);
	}

	@Override
	public boolean validNum(int num) {
		return num >= MIN && num <= MAX;
	}
}
