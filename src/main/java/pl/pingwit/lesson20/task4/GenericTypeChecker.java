package pl.pingwit.lesson20.task4;

public class GenericTypeChecker {
    public static void main(String[] args) {
        GenericClass genericClass = new GenericClass<>("omnomnom");
        genericClass.getType();
    }
}
