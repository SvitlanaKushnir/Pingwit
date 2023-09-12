package pl.pingwit.lesson3;

public class Task1Lesso3 {
    public static void main(String[] args) {

        double sum = 10;
        double result = 10; /* firts day result*/
        for (int day = 2; day <= 7; day++) {
            result = result + result * 0.1;
            sum += result;

        }
        System.out.println(sum);
    }
}