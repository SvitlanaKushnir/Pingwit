package pl.pingwit.lesson6;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] myArray = {2, 1, 3, 5, 4};

        int n;
        for (int i = 0; i < myArray.length - 1; i++) {
            if (myArray[i] > myArray[i + 1]) {
                n = myArray[i];
                myArray[i] = myArray[i + 1];
                myArray[i + 1] = n;
            }
        }
        System.out.println(Arrays.toString(myArray));
    }
}
