package pl.pingwit.lesson18.task1.package_1.package_2.package_3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Objects;
import java.util.Scanner;

public class JavaDeserialization {
    // в этом задании мы практикуем не сериализацию/десериализацию, а чтение запись
    // данных из файлов, это немного другое.
    public static void main(String[] args) {

        /*Scanner scanner = new Scanner(System.in);
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
        }*/

        File package1 = new File("src/main/java/pl/pingwit/lesson18/task1/package_1");
        System.out.println(package1.isDirectory());
        File package2 = new File("src/main/java/pl/pingwit/lesson18/task1/package_1/package_2");
        System.out.println(package2.isDirectory());
        File package3 = new File("src/main/java/pl/pingwit/lesson18/task1/package_1/package_2/package_3");
        package3.mkdir();

        // эту часть нужно переделать
        // С помощью класса Scanner прочитать и вывести в консоль содержимое файла example.txt

    }
}
/*
Task 1
В пакете с ДЗ создайте пакет package_1, внутри его еще один пакет package_2, а внутри его - текстовый файл (example.txt).
В классе Application c помощью класса File проверить, являются ли папками package_1 и package_2.
Создать внутри package_2 папку package_3.
С помощью класса Scanner прочитать и вывести в консоль содержимое файла example.txt
 */