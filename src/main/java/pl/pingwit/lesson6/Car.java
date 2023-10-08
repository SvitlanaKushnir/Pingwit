package pl.pingwit.lesson6;

public class Car {
    private String number;  // это поле уже находится внутри класса Car, поэтому достаточно было бы number
    private Owner owner;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Car{" +
                "number='" + number + '\'' +
                ", owner=" + owner +
                '}';
    }
    // по заданию, в этом классе нужны конструкторы и toString(), добавь плиз
}
