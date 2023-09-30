package pl.pingwit.lesson5;

import java.util.Arrays;

public class OddToZeroArray {
    public static void main(String[] args) { // int[] myArray используй плиз джава-стиль объявления массива
        int[] myArray = {1, 2, 3, 4, 5};
        for (int i = 0; i < myArray.length; i++) {
            // здесь я бы хотел, чтобы ты ЗАМЕНИЛА в исходном массиве нечетные элементы нулями. а потом распечатали результат после цикла
            if (i % 2 == 0) {
            myArray[i] = 0;
            }
        }
        System.out.println(Arrays.toString(myArray));
    }
}
