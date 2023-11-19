package pl.pingwit.lesson12.task3;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        Router router = new Router("TP-link", "1234567");
        GameConsole gameConsole = new GameConsole("PS", "5");

        System.out.println(router.connectWiFi(gameConsole.toString()));
    }
}
