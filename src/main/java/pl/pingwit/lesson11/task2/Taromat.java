package pl.pingwit.lesson11.task2;

import java.math.BigDecimal;

public class Taromat {
    private static final BigDecimal PLASTIC_PRICE = new BigDecimal("0.10");
    private static final BigDecimal Glass_PRICE = new BigDecimal("0.15");
    private static final BigDecimal ALUMINIUM_PRICE = new BigDecimal("0.15");

    public Receipt calculator(Tare[] tares) {
        // Эти переменные лучше объявить там, где они используются, в строке 32
        //BigDecimal plasticCost;
        //BigDecimal glassCost;
        //BigDecimal aluminiumCost;

        int plasticQuantity = 0;
        int glassQuantity = 0;
        int aluminiumQuantity = 0;

        for (Tare tare : tares) {
            if (tare.getMaterial().equals(Material.PLASTIC)) {
                plasticQuantity++;
            }
            if (tare.getMaterial().equals(Material.GLASS)) {
                glassQuantity++;
            }
            if (tare.getMaterial().equals(Material.ALUMINIUM)) {
                aluminiumQuantity++;
            }
        }

        BigDecimal plasticCost = (PLASTIC_PRICE.multiply(BigDecimal.valueOf(plasticQuantity)));
        BigDecimal glassCost = (Glass_PRICE.multiply(BigDecimal.valueOf(glassQuantity)));
        BigDecimal aluminiumCost = (ALUMINIUM_PRICE.multiply(BigDecimal.valueOf(aluminiumQuantity)));

        BigDecimal totalAmount = plasticCost.add(glassCost).add(aluminiumCost);

        String message = String.format(" You have supplied plastic bottles, %d glass bottles, %d aluminium bottles", plasticQuantity, glassQuantity, aluminiumQuantity);
        return new Receipt(message, totalAmount);
    }
}
