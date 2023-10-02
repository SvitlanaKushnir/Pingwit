package pl.pingwit.lesson6;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] myArray = {2, 1, 3, 5, 4};
        int n;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray.length - 1; j++) {
                if (myArray[j] > myArray[j + 1]) {
                    n = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = n;
                }
            }
        }
        System.out.println(Arrays.toString(myArray));
    }
}
