package pl.pingwit.lesson18.task1.package_1.package_2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class JavaSerializationExample { // в этом задании мы практикуем не сериализацию/десериализацию, а чтение запись
    // данных из файлов, это немного другое.
    public static void main(String[] args) {

        String filePath = "src/main/java/pl/pingwit/lesson18/task1/package_1/package_2/example.txt";
        File file = new File("example");

        // здесь нужно было использовать FileInputStream / FileOutputStream
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {

            oos.writeObject(file);
            System.out.println("Object successfully serialized to file.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}