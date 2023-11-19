package pl.pingwit.lesson12.task4;

public class Application {
    public static void main(String[] args) {
        Person person = new Person("Adam", "Adamov");
        Person person1 = new Person("Adam", "Adamov");

        PersonReverser stringUtilsPersonReverser = new StringUtilsPersonReverser();
        PersonReverser arrayPersonReverser = new ArrayPersonReverser();

        System.out.println(stringUtilsPersonReverser.reversPerson(person));
        System.out.println(arrayPersonReverser.reversPerson(person1));

        System.out.println(person.equals(person1));
        System.out.println(stringUtilsPersonReverser.equals(arrayPersonReverser));
    }
}
