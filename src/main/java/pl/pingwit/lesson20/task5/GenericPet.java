package pl.pingwit.lesson20.task5;

import pl.pingwit.lesson11.task1.PetData;

import java.util.Arrays;

public class GenericPet<T extends PetData> {
    private T[] pets;

    public GenericPet(T[] pets) {
        this.pets = pets;
    }

    public T[] getPets() {
        return pets;
    }

    public void setPets(T[] pets) {
        this.pets = pets;
    }

    @Override
    public String toString() {
        return "GenericPet{" +
                "pets=" + Arrays.toString(pets) +
                '}';
    }
}
