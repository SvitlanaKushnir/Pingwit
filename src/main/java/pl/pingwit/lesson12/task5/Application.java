package pl.pingwit.lesson12.task5;

public class Application {
    public static void main(String[] args) {
        Printer printer = new Printer();

        System.out.println(printer.turnOn());
        System.out.println(printer.print("Document is printed"));
        System.out.println(printer.turnOff());
    }
}
