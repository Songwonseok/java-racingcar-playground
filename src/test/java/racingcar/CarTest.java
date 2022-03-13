package racingcar;

import static org.assertj.core.api.AssertionsForClassTypes.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class CarTest {

	@Test
	void 이동_불가() {
		Car car1 = new Car("tester", new TestNumberGernator(Arrays.asList(1,2,3)));
		Car car2 = new Car("tester2", new TestNumberGernator(Arrays.asList(0,0,0)));

		car1.move();
		car2.move();

		assertThat(car1.getPosition()).isEqualTo(1);
		assertThat(car2.getPosition()).isEqualTo(1);
	}

	@Test
	void 이동_가능() {
		Car car1 = new Car("tester", new TestNumberGernator(Arrays.asList(4,5,6)));
		Car car2 = new Car("tester2", new TestNumberGernator(Arrays.asList(5,5,5)));

		car1.move();
		car2.move();

		assertThat(car1.getPosition()).isEqualTo(2);
		assertThat(car2.getPosition()).isEqualTo(2);
	}
}
