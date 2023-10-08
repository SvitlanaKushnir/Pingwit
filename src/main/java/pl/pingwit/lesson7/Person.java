package pl.pingwit.lesson7;

public class Person {
    static private String text = "Hello from static";
    private String name;
    private int age;

    {
        System.out.println("New class example has bee created");
    }

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String text) {
        this.name = name;
        this.age = age;
        this.text = text;
    }

    public static String getText() {
        return text;
    }

    public void setText(String text) {
        Person.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}