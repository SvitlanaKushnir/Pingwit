package pl.pingwit.lesson10.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your user name");
        String userName = scanner.nextLine();

        System.out.println("Please, enter your name");
        String name = scanner.nextLine();

        System.out.println("Please, enter your surname");
        String surname = scanner.nextLine();

        System.out.println("Please, enter your email");
        String email = scanner.nextLine();

        System.out.println("Please, enter your phone number");
        String phoneNumber = scanner.nextLine();

        System.out.println("Please, enter your password");
        String password = scanner.nextLine();

        UserData user = new UserData(userName, name, surname, email, phoneNumber, password);
        System.out.println(user);

        UserDataValidator userValidator = new UserDataValidator();
        boolean checkUser = userValidator.validateUserDate(user);
        System.out.println(checkUser);
    }
}
