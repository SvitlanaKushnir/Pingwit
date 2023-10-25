package pl.pingwit.lesson11.task1;

public class Hamster extends PetData{
    private final String color;
    private final Double weight;
    private final Double  cheekVolume;

    public Hamster(Long id, String name, Owner owner, String color, Double weight, Double cheekVolume) {
        super(id, name, owner);
        this.color = color;
        this.weight = weight;
        this.cheekVolume = cheekVolume;
    }

    public String getColor() {
        return color;
    }

    public Double getWeight() {
        return weight;
    }

    public Double getCheekVolume() {
        return cheekVolume;
    }

    public final String getHamsterInfo() {
        return String.format("Hamster's color is %s and its weight is %s. Hamster has cheeks with %s volume",
                color,
                weight,
                cheekVolume);
    }

    @Override
    public String toString() {
        return "Hamster{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", cheekVolume=" + cheekVolume +
                '}';
    }
}
