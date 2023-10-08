package pl.pingwit.lesson7;

public class CarArray {
    public static void main(String[] args) {
        Car car1 = new Car("Audi", "A5", 4);
        Car car2 = new Car("Volkswagen", "Golf6", 4);

        Car[] cars = {car1, car2};
        for (Car car : cars) {
            if (car.getBrand().equals("Audi")) {
                System.out.println(car);
                for (int i = 1; i <= car.getDoorAmount(); i++) {
                    System.out.println("The door number " + i + " is opened");
                }
            }
        }
    }
}
