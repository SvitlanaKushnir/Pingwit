package pl.pingwit.lesson11.task1;

public class PetData {
    private final Long id;
    private final String name;
    private final Owner owner;

    public PetData(Long id, String name, Owner owner) {
        this.id = id;
        this.name = name;
        this.owner = owner;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Owner getOwner() {
        return owner;
    }

    public final String getPetCard() {
        return String.format("This is %s. Pet's owner is  %s %s. Owner info: %s,%s",
                name,
                owner.getName(),
                owner.getSurname(),
                owner.getPhoneNumber(),
                owner.getEmail());
    }

    @Override
    public String toString() {
        return "PetData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", owner=" + owner +
                '}';
    }
}
