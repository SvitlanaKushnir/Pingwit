package pl.pingwit.lesson3;

public class EvenOddCalculator {
    public static void main(String[] args) {
        int sumOdd = 0;
        int sumEven = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                sumOdd = sumOdd + i;
            } else {
                sumEven = sumEven + i;
                ;  // лишняя ; в этой строке
            }
        }
        int totalSum = sumEven + sumOdd;
        System.out.println(sumOdd);
        System.out.println(sumEven);
        System.out.println(totalSum);
    }
// убери плиз пустую строку (вместе с моим комментом)
}