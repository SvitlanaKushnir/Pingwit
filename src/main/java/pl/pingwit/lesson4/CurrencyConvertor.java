package pl.pingwit.lesson4;

import java.util.Objects;
import java.util.Scanner;

// сделай плиз вторую версию этой программы, в которой для вычислений и хранения результатов будет использоваться не double,
// а BigDecimal
public class CurrencyConvertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your preferred currency");
        String currency = scanner.next();

        if (Objects.equals(currency, "eur")) {
            System.out.println("Please enter the amount of Euro");
        } else if (Objects.equals(currency, "uah")) {
            System.out.println("Please enter the amount of Hryvnia");
        } else {
            System.out.println("Sorry, entered currency is not supported");
            return;
        }

        double enteredAmount = scanner.nextDouble();
        double convertedAmount; // достаточно просто объявить переменную, инициализировать необязательно
        double currencyEur = 39.25;

        if (Objects.equals(currency, "eur")) {
            convertedAmount = enteredAmount * currencyEur;
            System.out.println(enteredAmount + " Euro " + " = " + convertedAmount + " Hryvnia");
        } else {
            convertedAmount = enteredAmount / currencyEur;
            System.out.println(enteredAmount + " Hryvnia " + " = " + convertedAmount + " Euro");
        }
    }
}
