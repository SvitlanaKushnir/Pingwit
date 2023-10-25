package pl.pingwit.lesson11.task1;

public class PetArray {
    public static void main(String[] args) {
        Owner catOwner = new Owner("Ivan", "Petrov", "+380931234567", "ivan@gmail.com");
        Owner dogOwner = new Owner("John", "Johanny", "+380931234500", "john@gmail.com");
        Owner hamsterOwner = new Owner("Daniel", "Danielev", "+380931234501", "daniel@gmail.com");
        Owner parrotOwner = new Owner("Jimmy", "Jimminov", "+380931234502", "jimmy@gmail.com");

        Cat cat = new Cat(012L, "Puhnastic", catOwner, "no breed", 4.30, 30.5);
        Dog dog = new Dog(935L, "Ronald", dogOwner, "shepherd", 12.75, 41.15);
        Hamster hamster = new Hamster(356L, "Stepan", hamsterOwner, "white", 0.45, 1.2);
        Parrot parrot = new Parrot(756L, "Rudolf", parrotOwner, "green", 12.85, true);

        PetData[] pets = {cat, dog, hamster, parrot};
        for (PetData pet : pets) {
            System.out.println(pet.getPetCard());
        }
        System.out.println(cat.getCatInfo());
        System.out.println(dog.getDogInfo());
        System.out.println(hamster.getHamsterInfo());
        System.out.println(parrot.getParrotInfo());
    }
}
