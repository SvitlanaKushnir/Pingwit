package pl.pingwit.lesson20.task1;

import java.util.ArrayList;
import java.util.Scanner;

public class AllowedPersonsList {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Alex");
        names.add("John");
        names.add("Emely");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");

        if ((names.contains(scanner.nextLine()))) {
            System.out.println("Welcome");
        } else {
            System.out.println("Sorry, your name is not in the guest list");
        }
    }
}
