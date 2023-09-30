package pl.pingwit.lesson4;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;
import java.util.Scanner;

public class CarInsuranceBigDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your engine capacity in cubic centimeters");
        BigDecimal engineCapacity = new BigDecimal(scanner.nextDouble());
        System.out.println("Did you have a car accident last year?");
        String carAccident = scanner.next();
        System.out.println("Do you have an insurance policy?");
        String insurancePolicy = scanner.next();

        BigDecimal price = BigDecimal.valueOf(0); // здесь лучше использовать BigDecimal.ZERO, либо вообще не инициализировать
        BigDecimal accidents = BigDecimal.valueOf(1.2);
        BigDecimal noAccidents = BigDecimal.valueOf(0.25);
        BigDecimal customer = BigDecimal.valueOf(0.8);

        if (Objects.equals(carAccident, "yes")) {
             price = new BigDecimal(engineCapacity.multiply(accidents).multiply(noAccidents).setScale(2, RoundingMode.CEILING).toString());
        } else {
             price = new BigDecimal(engineCapacity.multiply(noAccidents).setScale(2, RoundingMode.CEILING).toString());  // сделала округление - отлично!
        }

        if (Objects.equals(insurancePolicy, "yes")) {
             price = new BigDecimal(price.multiply(customer).setScale(2, RoundingMode.CEILING).toString());
            System.out.println("The" + " price " + " is " + price + " euro");
        } else {
            System.out.println("The" + " price " + " is " + price + " euro");
        }
    }
}