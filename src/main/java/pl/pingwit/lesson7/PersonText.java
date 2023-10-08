package pl.pingwit.lesson7;

public class PersonText {
    public static void main(String[] args) {

        Person person3 = new Person("Alex", 45);
        Person person4 = new Person("Nikita", 22);
        person4.setText("Hello");

       Person[] persons = {person3, person4};
      for (Person person : persons) {
        System.out.println(Person.getText());
      }
    }
}
