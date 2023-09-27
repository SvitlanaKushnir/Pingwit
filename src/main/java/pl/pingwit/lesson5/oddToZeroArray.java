package pl.pingwit.lesson5;

public class oddToZeroArray {
    public static void main(String[] args) { // int[] myArray используй плиз джава-стиль объявления массива
        int myArray[] = {1, 2, 3, 4, 5};
        for (int i = 0; i < myArray.length; i++) {
            // здесь я бы хотел, чтобы ты ЗАМЕНИЛА в исходном массиве нечетные элементы нулями. а потом распечатали результат после цикла
            if (i % 2 == 0) {
                System.out.println(myArray[i]);
            } else {
                System.out.println(0);
            }
        }
    }
}
