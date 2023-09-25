package pl.pingwit.lesson5;

import java.util.Arrays;

public class averageArray {
    public static void main(String[] args) {
        int myArray[] = {1, 2, 3 , 4, 5};
        System.out.println(Arrays.stream(myArray).average());
    }
}
