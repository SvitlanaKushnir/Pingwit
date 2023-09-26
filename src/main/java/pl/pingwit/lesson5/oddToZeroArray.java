package pl.pingwit.lesson5;

public class oddToZeroArray {
    public static void main(String[] args) {
        int myArray[] = {1, 2, 3, 4, 5};
        for (int i = 0; i < myArray.length; i++) {
            if (i % 2 != 0) {
                System.out.println(myArray[i]);
            } else {
                System.out.println(0);
            }
        }
    }
}
