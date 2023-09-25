package pl.pingwit.lesson4;

import java.util.Scanner;

public class road {
    private static final String ROAD_PART = "||  |  ||";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the time road in seconds");
        int time = scanner.nextInt();

        long startTime = System.currentTimeMillis();
        long finishTime = startTime + time;

        while (System.currentTimeMillis() < finishTime) {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.println(ROAD_PART);
            }
            for (int i = 10; i > 1; i--) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                System.out.println(ROAD_PART);
            }
        }
    }
}