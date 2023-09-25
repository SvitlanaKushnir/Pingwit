package pl.pingwit.lesson5;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class scannerArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter the second number");
        int secondNumber = scanner.nextInt();
        System.out.println("Please enter the third number");

        int thirdNumber = scanner.nextInt();
        int myArray[] = {firstNumber, secondNumber, thirdNumber};

        OptionalInt maxValue = Arrays.stream(myArray).max();
        OptionalInt minValue = Arrays.stream(myArray).min();

        System.out.println("Min number is " + minValue);
        System.out.println("Max number is " + maxValue);
    }
}
