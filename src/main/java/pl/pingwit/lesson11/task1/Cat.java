package pl.pingwit.lesson11.task1;

public class Cat extends PetData {
    private final String breed;
    private final Double weight;
    private final Double tailLength;

    public Cat(Long id, String name, Owner owner, String breed, Double weight, Double tailLength) {
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

    public final String getCatInfo() {
        return String.format("Cat's breed is %s and its weight is %s. Cat's tail has %s length",
                breed,
                weight,
                tailLength);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                ", weight=" + weight +
                ", tailLength=" + tailLength +
                '}';
    }
}
