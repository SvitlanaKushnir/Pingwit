package pl.pingwit.lesson3;

public class InchesIntoSm {
    public static void main(String[] args) {
        double inch = 2.54;
        double result = 0;
        for (int i = 1; i <= 20; i++) {
            result += inch;
            System.out.println(i + " inch = " + result + " sm");
        }
    }
}



