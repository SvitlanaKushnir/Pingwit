package pl.pingwit.lesson4;

import java.util.Scanner;

public class Butterfly { //касается всех классов в ДЗ 4 и 5 - классы нужно именовать с большой буквы
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the size of the butterfly");
        Integer butterflySize = Integer.valueOf(scanner.next());

        int column = butterflySize * 2;

        for (int i = 1; i <= butterflySize; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <= (column) - (i * 2); j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = 1; i < butterflySize; i++) {
            for (int j = 1; j <= butterflySize - i; j++) {
                System.out.print(j);
            }
            for (int j = column; j > (column) - (i * 2); j--) {
                System.out.print(" ");
            }
            for (int j = butterflySize - i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

