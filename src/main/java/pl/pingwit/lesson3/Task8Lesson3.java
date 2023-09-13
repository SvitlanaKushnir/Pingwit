package pl.pingwit.lesson3;

public class Task8Lesson3 {
    public static void main(String[] args) {
        int result1 = 0;
        int result2 = 0;
        int sumOdd = 0;
        int sumEven = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                result1 = result1 + i;
            } else {
                result2 = result2 + i;
            }
            ;
        }
        sumEven += result1;
        sumOdd += result2;
        int totalSum = result1 + result2;
        System.out.println(sumOdd);
        System.out.println(sumEven);
        System.out.println(totalSum);
    }

}