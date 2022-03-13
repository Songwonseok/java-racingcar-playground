package racingcar;

import static org.assertj.core.api.AssertionsForClassTypes.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class NumberGeneratorTest {

	@Test
	void 숫자_생성하기() {
		NumberGenerator numberGenerator = new TestNumberGernator(Arrays.asList(1,2,3));
		int number = numberGenerator.generateNumber();
		assertThat(number).isEqualTo(1);
	}

	@Test
	void 숫자_유효성_검사() {
		NumberGenerator numberGenerator = new TestNumberGernator(Arrays.asList(1,2,3));
		assertThat(numberGenerator.validNum(0)).isTrue();
		assertThat(numberGenerator.validNum(9)).isTrue();
		assertThat(numberGenerator.validNum(10)).isFalse();
	}


}
