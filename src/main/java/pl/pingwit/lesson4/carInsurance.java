package pl.pingwit.lesson4;

import java.util.Objects;
import java.util.Scanner;

// сделай плиз вторую версию этой программы, в которой для вычислений и хранения результатов будет использоваться не double,
// а BigDecimal
public class carInsurance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your engine capacity in cubic centimeters");
        double engineCapacity = scanner.nextDouble();
        System.out.println("Did you have a car accident last year?");
        String carAccident = scanner.next();
        System.out.println("Do you have an insurance policy?");
        String insurancePolicy = scanner.next();

        double price1 = 0;

        if (Objects.equals(carAccident, "yes")) {
            price1 = engineCapacity * 0.25 * 1.2;
        } else {
            price1 = engineCapacity * 0.25;
        }

        double price2 = 0; // переменную price2 вводить необязательно - можно хранить все в одной переменной

        if (Objects.equals(insurancePolicy, "yes")) {
            price2 = price1 * 0.8;
        } else {
            price2 = price1;  // этот else можно было бы не делать
        }
        System.out.println("The" + " price " + " is " + price2 + " euro");
    }
}
