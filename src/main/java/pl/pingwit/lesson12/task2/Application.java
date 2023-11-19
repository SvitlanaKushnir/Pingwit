package pl.pingwit.lesson12.task2;

public class Application {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 9, 21, 14, 15};
        int a = 100;
        for (int number : numbers) {
            try {
                int b = number - 9;
                int result = a / b;
                System.out.println(result);
            } catch (ArithmeticException exception) {
                System.out.println("An arithmetic error found while processing " + number + exception.getMessage());
            }
        }
    }
}
