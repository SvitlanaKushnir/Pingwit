package pl.pingwit.lesson7;

import java.util.Arrays;

public class HouseArray {
    public static void main(String[] args) {
        House house1 = new House("oneFloor", 1, 2, true);
        House house2 = new House("multiFloor", 12, 200, false);
        House house3 = new House("oneFloor", 1, 2, false);
        House house4 = new House("multiFloor", 5, 78, true);
        House house5 = new House("oneFloor", 1, 3, true);


        House[] houses = {house1, house2, house3, house4, house5};
        System.out.println(Arrays.toString(houses));

        int totalResidentAmount = countResidentsAmount(houses);
        int totalAmountOfIndividualHouses = countTotalAmountOfIndividualHouses(houses);
        turnOnCentralHeating(houses);
        System.out.println("Total amount of residents are " + totalResidentAmount);
        System.out.println("Total amount of individuals houses are " + totalAmountOfIndividualHouses);
    }

    private static int countResidentsAmount(House[] houses) {  // этот метод не печатает, а только вычисляет количесвто жителей.
        // ему подошло бы другое имя
        int totalResidentAmount = 0;
        for (House house : houses) {
            if (house.getFloorAmount() > 1) {
                totalResidentAmount += house.getResidentAmount();
            }
        }
        return totalResidentAmount;
    }

    private static int countTotalAmountOfIndividualHouses(House[] houses) { // этот метод не печатает, а только вычисляет
        // количество жителей. ему подошло бы другое имя
        int totalAmountOfIndividualHouses = 0;
        for (House house : houses) {
            if (house.getFloorAmount() == 1) { // кажется, что условие должно быть другим: у индивидуальных домов этажей == 1
                totalAmountOfIndividualHouses += 1;
            }
        }
        return totalAmountOfIndividualHouses;
    }

    private static void turnOnCentralHeating(House[] houses) {
        for (House house : houses) {
            if (house.getFloorAmount() > 5 && !house.isHeatingOn()) {
                house.setHeatingOn(true);
                System.out.println(house);
            }
        }
    }
}
