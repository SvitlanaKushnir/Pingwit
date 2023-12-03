package pl.pingwit.lesson19.task1;

import java.io.Serializable;
import java.util.Objects;

public class Motorcycle implements Serializable {
    private final String brand;
    private final String model;
    private final Integer engineVolume;
    private final transient String condition;

    public Motorcycle(String brand, String model, Integer engineVolume, String condition) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", condition='" + condition + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Motorcycle that = (Motorcycle) o;
        return Objects.equals(brand, that.brand) && Objects.equals(model, that.model) && Objects.equals(engineVolume, that.engineVolume) && Objects.equals(condition, that.condition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, condition);
    }
}
