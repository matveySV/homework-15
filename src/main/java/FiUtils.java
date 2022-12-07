import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Random;
import java.util.function.*;

import static java.time.LocalDate.now;

public class FiUtils {

    public static Predicate<Integer> getIsPrime() {
        return isPrime;
    }
    public static Consumer<Integer> getOutputRandomNum() {
        return outputRandomNum;
    }

    public static Supplier<DayOfWeek> getCurrentDay() {
        return currentDay;
    }

    public static Function<Double, Long> getRound() {
        return round;
    }

    public static UnaryOperator<Integer> getFibo() {
        return fibo;
    }

    private static Predicate<Integer> isPrime = num -> {
        if (num <= 1) return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % 2 == 0) {
                return false;
            }
        }
        return true;
    };
    private static Consumer<Integer> outputRandomNum = num -> {
        Random random = new Random();
        System.out.println("random num is: " + random.nextInt(num));
    };
    private static Supplier<DayOfWeek> currentDay = () -> LocalDate.now().getDayOfWeek();
    private static Function<Double, Long> round = num -> Math.round(num);
    private static UnaryOperator<Integer> fibo = integer -> {
        int previous = 0;
        int next = 1;
        if (integer <= 0) throw new IllegalArgumentException("Please input correct value");
        if (integer == 1) return next;

        int sum = integer;
        for (int i = 1; i < integer; i++) {
            sum = previous + next;
            previous = next;
            next = sum;
        }
        return sum;
    };
}
