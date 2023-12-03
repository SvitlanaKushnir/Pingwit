package pl.pingwit.lesson19.task1.package_1.package_2;

import java.io.Serializable;

public class File implements Serializable {
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
