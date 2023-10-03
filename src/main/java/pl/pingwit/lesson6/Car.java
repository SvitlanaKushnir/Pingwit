package pl.pingwit.lesson6;

public class Car {
    private String carNumber;  // это поле уже находится внутри класса Car, поэтому достаточно было бы number
    private Owner owner;

    // по заданию, в этом классе нужны конструкторы и toString(), добавь плиз

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
