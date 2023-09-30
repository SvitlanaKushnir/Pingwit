package pl.pingwit.lesson4;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;
import java.util.Scanner;

public class CurrencyConvertorBigDecimal {
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

        BigDecimal enteredAmount = new BigDecimal(scanner.next());
        BigDecimal currencyEur = BigDecimal.valueOf(39.25);  // предлагаю вынести константу

        if (Objects.equals(currency, "eur")) {
            // вычисления хочется разместить внутри if else
            BigDecimal convertedAmount1 = new BigDecimal(enteredAmount.multiply(currencyEur).toString()); // правильнее будет сделать так: enteredAmount.multiply(currencyEur)
            System.out.println(enteredAmount + " Euro " + " = " + convertedAmount1 + " Hryvnia");
        } else {
            // вычисления хочется разместить внутри if else
            BigDecimal convertedAmount2 = new BigDecimal(enteredAmount.divide(currencyEur, RoundingMode.HALF_EVEN).toString()); // здесь аналогично: enteredAmount.divide(currencyEur, RoundingMode.HALF_EVEN)
            System.out.println(enteredAmount + " Hryvnia " + " = " + convertedAmount2 + " Euro");
        }
    }
}
