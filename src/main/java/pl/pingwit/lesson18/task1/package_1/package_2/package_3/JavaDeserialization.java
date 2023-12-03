package pl.pingwit.lesson18.task1.package_1.package_2.package_3;

import pl.pingwit.lesson18.task1.package_1.package_2.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Objects;
import java.util.Scanner;

public class JavaDeserialization {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter file name");
        String fileName = scanner.nextLine();

        if (Objects.equals(fileName, "example")) {

            String filePath = "src/main/java/pl/pingwit/lesson18/task1/package_1/package_2/example.txt";

            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
                File file = (File) ois.readObject();
                System.out.println(file);

            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        else {
            System.out.println("File not found");
        }
    }
}
