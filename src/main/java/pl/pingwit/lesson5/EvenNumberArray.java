package pl.pingwit.lesson5;

import java.util.Arrays;

public class EvenNumberArray {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5}; // int[] myArray используй плиз джава-стиль объявления массива
        int[] mySecondArray = new int[5]; // int[] myArray используй плиз джава-стиль объявления массива
        for (int i = 0; i < myArray.length; i++) {
            if (i % 2 != 0) {
                mySecondArray[i] = myArray[i];
            }
        }
        System.out.println(Arrays.toString(mySecondArray));
    }
}