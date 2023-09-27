package pl.pingwit.lesson5;

public class multiplicationTable {
    public static void main(String[] args) {
        // красивое решение!
        int[][] myTwoArrays = {{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}};
        for (int i = 0; i < myTwoArrays[0].length; i++) {
            for (int j = 0; j < myTwoArrays[1].length; j++) {
                int multiplication = myTwoArrays[0][i] * myTwoArrays[1][j];
                System.out.println(myTwoArrays[0][i] + " * " + myTwoArrays[1][j] + " = " + multiplication);
            }
        }
    }
}
