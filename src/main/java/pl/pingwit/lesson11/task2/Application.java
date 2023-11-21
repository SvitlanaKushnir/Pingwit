package pl.pingwit.lesson11.task2;

public class Application {

    public static void main(String[] args) {
// пустая строка не нужна
        Tare[] tares = new Tare[]{
                new Tare("Bottle1", Material.ALUMINIUM),
                new Tare("Bottle2 Spring", Material.PLASTIC),
                new Tare("Bottle3", Material.GLASS)
        };

        Taromat taromat = new Taromat();
// пустая строка не нужна
        System.out.println(taromat.calculator(tares));
    }
}
