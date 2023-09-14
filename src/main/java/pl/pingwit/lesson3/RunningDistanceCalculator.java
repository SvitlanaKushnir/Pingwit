package pl.pingwit.lesson3;

// поправь плиз имя. можно уже выбирать имена, связанные с сутью задачи: например RunningDistanceCalculator
public class RunningDistanceCalculator {
    public static void main(String[] args) {

        double sum = 10;
        double result = 10; /* firts day result*/ // предлагаю вынести в константу и использовать в строках 7 и 8
        for (int day = 2; day <= 7; day++) {
            result = result + result * 0.1;
            sum += result;

        }
        System.out.println(sum);
    }
}