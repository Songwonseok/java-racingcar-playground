package racingcar;

public class Car {
	private final String name;
	private int position;
	private final NumberGenerator numberGernator;
	private static final int BASED_VALUE = 4;

	public Car(String name, NumberGenerator numberGernator) {
		this.name = name;
		this.position = 1;
		this.numberGernator = numberGernator;
	}

	public void move() {
		if(isMovable()) {
			position++;
		}
	}

	private boolean isMovable() {
		return numberGernator.generateNumber() >= BASED_VALUE;
	}

	public int getPosition() {
		return position;
	}

	public String getName() {
		return name;
	}
}
