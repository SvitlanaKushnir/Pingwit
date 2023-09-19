package pl.pingwit.lesson3;

public class AmoebaCalculator {
    public static void main(String[] args) {
        int result = 1;
        for (int time = 3; time <= 24; time = time + 3) {
            result = result * 2;
            System.out.println("In " + time + " hours you will see " + result + " amoebas");
        }
    }
}
