package pl.pingwit.lesson3;

public class Task2Lesson3 {
    public static void main(String[] args) {
        int amoeba = 1;
        int result = amoeba * amoeba;
        for (int time = 3; time <= 24; time = time + 3 ) {
            result = result * 2;
            System.out.println(result);
        }

    }
}
