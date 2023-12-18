package pl.pingwit.lesson20.task5;

import pl.pingwit.lesson11.task1.*;

import java.util.Arrays;

public class GenericPetArray {
    public static void main(String[] args) {
        GenericPet<PetData> genericPet = new GenericPet<>(new PetData[]{new Dog(1L, "Sharic", new Owner("Ivan", "Petrov", "+380931234567", "ivan@gmail.com"), "no breed", 16.75, 18.98),
                new Cat(2L, "Puhnastic", new Owner("Stepan", "Stepanow", "+380937861278", "stepan@gmail.com"), "no breed", 4.75, 35.23)});

        PetData[] pets = genericPet.getPets();
        System.out.println(Arrays.toString(pets));
    }
}
