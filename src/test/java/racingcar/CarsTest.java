package racingcar;

import static org.assertj.core.api.AssertionsForClassTypes.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class CarsTest {

	@Test
	void play() {
		Car car1 = new Car("kim", new TestNumberGernator(Arrays.asList(1,2,3,4)));
		Car car2 = new Car("park", new TestNumberGernator(Arrays.asList(5,2,3,4)));
		Car car3 = new Car("choi", new TestNumberGernator(Arrays.asList(1,2,3,4)));

		Cars cars = new Cars(Arrays.asList(car1,car2,car3), 1);
		cars.play();

		Map<String, Integer> nameToPosition = cars.getNameToPosition();

		assertThat(nameToPosition.get("kim")).isEqualTo(1);
		assertThat(nameToPosition.get("park")).isEqualTo(2);
		assertThat(nameToPosition.get("choi")).isEqualTo(1);
	}

	@Test
	void 우승자_1명() {
		Car car1 = new Car("kim", new TestNumberGernator(Arrays.asList(1,2,3,4)));
		Car car2 = new Car("park", new TestNumberGernator(Arrays.asList(5,2,3,4)));
		Car car3 = new Car("choi", new TestNumberGernator(Arrays.asList(1,2,3,4)));

		Cars cars = new Cars(Arrays.asList(car1,car2,car3), 1);
		cars.play();

		List<String> winners = cars.getWinners();

		assertThat(winners.get(0)).isEqualTo("park");
	}

	@Test
	void 우승자_2명() {
		Car car1 = new Car("kim", new TestNumberGernator(Arrays.asList(1,2,3,4)));
		Car car2 = new Car("park", new TestNumberGernator(Arrays.asList(5,2,3,4)));
		Car car3 = new Car("choi", new TestNumberGernator(Arrays.asList(4,2,3,4)));

		Cars cars = new Cars(Arrays.asList(car1,car2,car3), 1);
		cars.play();

		List<String> winners = cars.getWinners();

		assertThat(winners.get(0)).isEqualTo("park");
		assertThat(winners.get(1)).isEqualTo("choi");
	}


}
