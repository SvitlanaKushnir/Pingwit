package pl.pingwit.lesson10.task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserDataValidator {
    private static final Pattern LETTERS_ONLY = Pattern.compile("[a-zA-Z]*");
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
    private static final Pattern DIGITS_ONLY = Pattern.compile("[0-9]+");

    public boolean validateUserDate(UserData user) {
        if ((user.userName().isEmpty())) {
            System.out.println("This field is required");
            return false;
        }
        Matcher nameMatcher = LETTERS_ONLY.matcher(user.name());
        if (!nameMatcher.matches()) {
            System.out.printf("This field can only contain letters. name is incorrect: %s %n", user.name());
            return false;
        }
        Matcher surnameMatcher = LETTERS_ONLY.matcher(user.surname());
        if (!surnameMatcher.matches()) {
            System.out.printf("Surname can only contain letters.Surname is incorrect: %s ", user.surname());
            return false;
        }
        Matcher emailMatcher = EMAIL_PATTERN.matcher(user.email());
        if (!emailMatcher.matches()) {
            System.out.printf("Email is incorrect %s ", user.email());
            return false;
        }
        Matcher phoneMatcher = DIGITS_ONLY.matcher(user.phoneNumber());
        if (!phoneMatcher.matches()) {
            System.out.printf("This field can only contain digits. Phone number is incorrect: %s", user.phoneNumber());
            return false;
        }
        if ((user.password().isEmpty())) {
            System.out.println("This field can't be empty");
            return false;
        }
        return true;
    }
}
