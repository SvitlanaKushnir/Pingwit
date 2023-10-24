package pl.pingwit.lesson10.task2;

import java.util.Arrays;

public class PalindromArray {
    public boolean checkPalindrom(String word) {
        char[] wordArray = word.toCharArray();
        char[] reversedWordArray = new char[wordArray.length];

        for (int i = wordArray.length - 1; i >= 0; i--) {
            reversedWordArray[wordArray.length - 1 - i] = wordArray[i];
        }
        return Arrays.equals(wordArray,reversedWordArray);
    }
}
