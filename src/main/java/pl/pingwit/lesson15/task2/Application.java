package pl.pingwit.lesson15.task2;

public class Application {
    public static void main(String[] args) {
        String data = "Fedor, Petrov, 7, 1980-25-02; Peter, Parker, 4, 1970-01-01; Inna, Filatova, 6, 1994-02-10";
        String updatedData = "Fedor, Petrov, 7, 1980-25-02; Maks, Ermolaev, 12, 1987-02-03; Peter, Parker, 4, 1970-01-01; Inna, Filatova, 6, 1994-02-10";

        PersonParser personParser = new PersonParser();
        Person[] persons = personParser.parse(updatedData);
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
