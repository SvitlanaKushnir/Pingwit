package pl.pingwit.lesson9;

import pl.pingwit.lesson7.House;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        DepositBox Box1 = new DepositBox(1, "av", new String[]{"Gold"});
        DepositBox Box2 = new DepositBox(2, "avr", new String[]{"Money"});
        DepositBox Box3 = new DepositBox(3, "avrf", new String[]{"Docs"});
        DepositBox Box4 = new DepositBox(4, "avrfs", new String[]{"Gold"});
        DepositBox Box5 = new DepositBox(4, "avrfsg", new String[]{"Docs"});

        DepositBox[] depositBoxes = {Box1, Box2, Box3, Box4, Box5};
        System.out.println(Arrays.toString(depositBoxes));

        System.out.println(Arrays.toString(Box2.extractValuables("123")));
        System.out.println(Arrays.toString(Box2.extractValuables("avr")));

        BankWarehouse bankWarehouse = new BankWarehouse("firstCell", depositBoxes);
        for (int i = 0; i < 6; i++){
            System.out.println(bankWarehouse.next());
        }
    }
}