package pl.pingwit.lesson3;

public class Task7Lesson3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i = i + 2) {
            sum += i;
        }
        System.out.println(sum);
    }
}