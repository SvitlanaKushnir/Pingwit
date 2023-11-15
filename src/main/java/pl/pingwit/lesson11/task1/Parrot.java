package pl.pingwit.lesson11.task1;

public class Parrot extends PetData {
    private final String color;
    private final Double wingsLength;
    private final Boolean talk; // в этом поле хранится информация о том, говорящий ли попугай. ему бы больше подошло имя 'isTalking'

    public Parrot(Long id, String name, Owner owner, String color, Double wingLength, Boolean talk) {
        super(id, name, owner);
        this.color = color;
        this.wingsLength = wingLength;
        this.talk = talk;
    }

    public String getColor() {
        return color;
    }

    public Double getWingLength() {
        return wingsLength;
    }

    public Boolean getTalk() {
        return talk;
    }

    public final String getParrotInfo() {
        return String.format("Parrot's color is %s and it has wings with %s length. Can this parrot talk? - %s.",
                color,
                wingsLength,
                talk);
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "color='" + color + '\'' +
                ", wingLength=" + wingsLength +
                ", talk=" + talk +
                '}';
    }
}
