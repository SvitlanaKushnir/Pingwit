package pl.pingwit.lesson12.task3;

public class GameConsole {
    private final String name;
    private final String model;

    public GameConsole(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "GameConsole{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
