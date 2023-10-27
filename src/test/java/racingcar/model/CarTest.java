package racingcar.model;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Test;

public class CarTest {
    @Test
    void 기준넘지않으면_이동불가() {
        TestNumberGenerator testGenerator = new TestNumberGenerator(1);
        Car car = new Car("CarName", testGenerator);
        car.move();

        assertThat(car.getDistance()).isEqualTo(0);
    }

    @Test
    void 기준이상이면_이동가능() {
        TestNumberGenerator testGenerator = new TestNumberGenerator(4);
        Car car = new Car("CarName", testGenerator);
        car.move();

        assertThat(car.getDistance()).isEqualTo(1);
    }
}
