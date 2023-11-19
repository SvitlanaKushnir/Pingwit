package pl.pingwit.lesson12.task5;

import org.apache.commons.lang3.RandomUtils;

public class Printer {
    public String turnOn() {
        return "Printer is on";
    }

    public String print(String document) {
        try {
            if (RandomUtils.nextBoolean()) {
                throw new MyException("An error has been occurred, please try again later!");
            }
            return document;
        } finally {
            turnOff();
            System.out.println("Printer is off");
        }
    }

    public String turnOff() {
        return "Printer is off";
    }
}
