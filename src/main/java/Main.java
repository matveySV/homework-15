import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println(FiUtils.getIsPrime().test(9));
        FiUtils.getOutputRandomNum().accept(10);
        System.out.println(FiUtils.getCurrentDay().get());
        System.out.println(FiUtils.getRound().apply(5.32));
        System.out.println(FiUtils.getFibo().apply(10));

    }
}