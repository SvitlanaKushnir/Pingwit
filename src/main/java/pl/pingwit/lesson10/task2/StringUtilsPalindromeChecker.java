package pl.pingwit.lesson10.task2;

import org.apache.commons.lang3.StringUtils;

public class StringUtilsPalindromeChecker {
    public boolean checkPalindrom(String word){
        String reversWord = StringUtils.reverse(word);
        return reversWord.equals(word);
    }
}
