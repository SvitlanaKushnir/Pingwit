package pl.pingwit.lesson5;

import java.util.Scanner;

public class ScannerArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter the second number");
        int secondNumber = scanner.nextInt();
        System.out.println("Please enter the third number");
        int thirdNumber = scanner.nextInt();
        int[] myArray = {firstNumber, secondNumber, thirdNumber};// int[] myArray используй плиз джава-стиль объявления массива

        int sum = 0;
        for (int number : myArray) {
            sum += number;
        }

        int minValue = myArray[0];
        for (int number : myArray) {
            if (number <= minValue)
                minValue = number;
        }

        int maxValue = myArray[0];
        for (int number : myArray) {
            if (number > maxValue)
                maxValue = number;
        }
        //мы пока не знакомы с Arrays.stream(myArray), поэтому попробуй плиз написать поиск максимального элемента с помощью цикла
        // у Вадима видел решение с помощью цикла, можно глянуть
        System.out.println("Sum of three numbers is " + sum);
        System.out.println("Min number is " + minValue);
        System.out.println("Max number is " + maxValue);
    }
}
