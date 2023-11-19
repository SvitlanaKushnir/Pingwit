package pl.pingwit.lesson12.task1;

public class RotaryPhone extends AbstractPhone {
    private final String color;

    public RotaryPhone(String model, String number, String color, AccumulatorType lithium) {
        super(model, number);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean makeCall() {
        return super.makeCall();
    }

    @Override
    public boolean receiveCall() {
        return super.receiveCall();
    }

    @Override
    public String toString() {
        return "RotaryPhone{" +
                "color='" + color + '\'' +
                '}';
    }
}
