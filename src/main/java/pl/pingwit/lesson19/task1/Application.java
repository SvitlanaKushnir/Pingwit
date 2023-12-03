package pl.pingwit.lesson19.task1;

import pl.pingwit.lesson18.task1.package_1.package_2.File;

import java.io.*;

public class Application {
    public static void main(String[] args) {

        String filePath = "src/main/java/pl/pingwit/lesson19/task1/motorcycle.txt";
        Motorcycle motorcycle = new Motorcycle("BMW", "R1800", 16, "used");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {

            oos.writeObject(motorcycle);
            System.out.println("Object successfully serialized to file.");

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            Motorcycle motorcycle1 = (Motorcycle) ois.readObject();
            System.out.println(motorcycle1);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
