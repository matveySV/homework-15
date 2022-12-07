import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.util.Random;
import java.util.function.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class FiUtilsTest {

    @Test
    void shouldShowTheNumberIsPrime() {
        Predicate<Integer> predicate = FiUtils.getIsPrime();
        boolean result = predicate.test(21);
        assertThat(result).isTrue();
    }

    @Test
    void getCurrentDay() {
        Supplier<DayOfWeek> supplier = FiUtils.getCurrentDay();
        assertThat(supplier.get()).isEqualTo(DayOfWeek.WEDNESDAY);
    }

    @Test
    void getRound() {
        Function<Double, Long> function = FiUtils.getRound();
        assertThat(function.apply(4.51)).isEqualTo(5);

    }

    @Test
    void getFibo() {
        UnaryOperator<Integer> unaryOperator = FiUtils.getFibo();
        assertThat(unaryOperator.apply(7)).isEqualTo(13);
    }
}