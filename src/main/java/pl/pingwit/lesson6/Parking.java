package pl.pingwit.lesson6;

public class Parking {
    public static void main(String[] args) {

        Owner owner1 = new Owner();
        owner1.setName("Alex");
        owner1.setSurname("Alexandov");
        owner1.setPhoneNumber("+380931234567");
        owner1.setEmail("alex@gmail.com");

        Owner owner2 = new Owner();
        owner2.setName("Nikita");
        owner2.setSurname("Nikitov");
        owner2.setEmail("");
        owner2.setPhoneNumber("+380931984562");

        Owner owner3 = new Owner();
        owner3.setName("Ihor");
        owner3.setSurname("Ihorovich");
        owner3.setEmail("ihor@gmail.com");
        owner3.setPhoneNumber("+380931984584");

        Owner owner4 = new Owner();
        owner4.setName("Sveta");
        owner4.setSurname("Svetlanovna");
        owner4.setEmail("sveta@gmail.com");
        owner4.setPhoneNumber("+380930084501");

        Owner owner5 = new Owner();
        owner5.setName("Anton");
        owner5.setSurname("Antonov");
        owner5.setEmail("");
        owner5.setPhoneNumber("+380930012012");

        Car car1 = new Car();
        car1.setNumber("AM0000AM");
        car1.setOwner(owner1);

        Car car2 = new Car();
        car2.setNumber("AM0101AM");
        car2.setOwner(owner2);

        Car car3 = new Car();
        car3.setNumber("AM1221AM");
        car3.setOwner(owner3);

        Car car4 = new Car();
        car4.setNumber("AM01200AM");
        car4.setOwner(owner4);

        Car car5 = new Car();
        car5.setNumber("AM2331AM");
        car5.setOwner(owner5);

        Car[] cars = {car1, car2, car3, car4, car5};
        for (Car car : cars) {
            System.out.println(car);  // в данный момент в консоль выводятся записи вида pl.pingwit.lesson6.Car@7a81197d, а нужно, чтобы выводилась информация о машине. это нужно исправить, переопредеделив метод toString() в классе Car
        }
    }
}
