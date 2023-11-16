package pl.pingwit.lesson11.task2;

import java.util.Objects;

public class Tare {
    private final String productName;
    private final Material material;

    public Tare(String productName, Material material) {
        this.productName = productName;
        this.material = material;
    }

    public String getProductName() {
        return productName;
    }

    public Material getMaterial() {
        return material;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tare tare = (Tare) o;
        return Objects.equals(productName, tare.productName) && material == tare.material;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, material);
    }

    @Override
    public String toString() {
        return "Tare{" +
                "productName='" + productName + '\'' +
                ", material=" + material +
                '}';
    }
}