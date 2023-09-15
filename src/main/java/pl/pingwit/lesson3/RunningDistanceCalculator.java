package pl.pingwit.lesson3;

// поправь плиз имя. можно уже выбирать имена, связанные с сутью задачи: например RunningDistanceCalculator
public class RunningDistanceCalculator {
// убери плиз 1 пустую строку (вместе с моим комментом)

    public static final int FIRST_DAY_RESULT = 10;

    public static void main(String[] args) {
// убери плиз пустую строку (вместе с моим комментом)
        double sum = FIRST_DAY_RESULT;
        double result = FIRST_DAY_RESULT;
        for (int day = 2; day <= 7; day++) {
            result = result + result * 0.1;
            sum += result;
// убери плиз пустую строку (вместе с моим комментом)
        }
        System.out.println(sum);
    }
}