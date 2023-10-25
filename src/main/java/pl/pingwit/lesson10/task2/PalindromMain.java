package pl.pingwit.lesson10.task2;

import java.util.Scanner;

public class PalindromMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter any word");
        String word = scanner.nextLine();

        StringUtilsPalindromeChecker palindrom = new StringUtilsPalindromeChecker();
        boolean checkPalindrom = palindrom.checkPalindrom(word);

        System.out.println(checkPalindrom);
    }
}
