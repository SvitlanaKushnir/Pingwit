package pl.pingwit.lesson7;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] mySecondArray = new int[8];
        for (int i = 0; i < myArray.length; i++) {
            if (i % 2 != 0) {
                myArray[i] *= 5;
            }
            mySecondArray[i] = myArray[i];
        }
        System.out.println(Arrays.toString(mySecondArray));
    }
}
