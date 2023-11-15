package pl.pingwit.lesson11.task1;

public class Dog extends PetData {
    private final String breed;
    private final Double weight;
    private final Double tailLength;

    public Dog(Long id, String name, Owner owner, String breed, Double weight, Double tailLength) {
        super(id, name, owner);
        this.breed = breed;
        this.weight = weight;
        this.tailLength = tailLength;
    }

    public String getBreed() {
        return breed;
    }

    public Double getWeight() {
        return weight;
    }

    public Double getTailLength() {
        return tailLength;
    }

    public final String getDogInfo() {
        return String.format("Dog's breed is %s and its  weight is %s. Dog's tail has %s length",
                breed,
                weight,
                tailLength);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", weight=" + weight +
                ", tailLength=" + tailLength +
                '}';
    }
}
