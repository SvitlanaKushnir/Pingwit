package pl.pingwit.lesson7;

public class Car {
    private String brand;
    private String model;
    private int doorAmount;

    public Car(String brand, String model, int doorAmount) {
        this.brand = brand;
        this.model = model;
        this.doorAmount = doorAmount;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDoorAmount() {
        return doorAmount;
    }

    public void setDoorAmount(int doorAmount) {
        this.doorAmount = doorAmount;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", doorAmount=" + doorAmount +
                '}';
    }
}
