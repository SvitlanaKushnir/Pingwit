package pl.pingwit.lesson7;

public class PersonArray {
    public static void main(String[] args) {

        Person person1 = new Person("Alex", 45);
        Person person2 = new Person("Nikita", 22);

        Person [] persons = {person1, person2};
        for (Person person: persons) {
            System.out.println(person);
        }
    }
}
