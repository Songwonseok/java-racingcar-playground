package racingcar;

import java.util.List;

public class TestNumberGernator implements NumberGenerator {
	private List<Integer> numbers;
	private int index;

	public TestNumberGernator() {}

	public TestNumberGernator(List<Integer> numbers) {
		this.numbers = numbers;
		this.index = 0;
	}

	@Override
	public int generateNumber() {
		return numbers.get(index++);
	}

	@Override
	public boolean validNum(int num) {
		return num >= MIN && num <= MAX;
	}
}
