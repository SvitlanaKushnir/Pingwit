package pl.pingwit.lesson18.task1.package_1.package_2;

import java.io.Serializable;

public class File implements Serializable { // в Джаве существует класс File, в котором есть ряд методов для работы с файловой
    // системой, поэтому создавать собственный было не нужно.
    private String name;

    public File() {
    }
    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "File{" +
                "name='" + name + '\'' +
                '}';
    }
}
