package racingcar;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Cars {
	private final List<Car> cars;
	private final int lastRound;
	private int round;

	public Cars(List<Car> cars, int lastRound) {
		this.cars = cars;
		this.lastRound = lastRound;
		this.round = 1;
	}

	public void play() {
		if(isFinished()) {
			return;
		}
		this.round++;
		cars.stream().forEach(car -> car.move());
	}

	public Map<String, Integer> getNameToPosition() {
		Map<String, Integer> map = new HashMap<>();

		cars.stream().forEach(car -> map.put(car.getName(), car.getPosition()));

		return map;
	}

	public boolean isFinished() {
		return round > lastRound;
	}

	public List<String> getWinners() {
		if (!isFinished()) {
			return null;
		}

		int winPosition = cars.stream().mapToInt(car -> car.getPosition()).max().orElse(1);

		return cars.stream()
			.filter(car -> car.getPosition() == winPosition)
			.map(car -> car.getName())
			.collect(Collectors.toList());
	}

}
