package pl.pingwit.lesson12.task1;

public abstract class AbstractPhone implements Phone {
    private String model;
    private String number;

    public AbstractPhone(String model, String number) {
        this.model = model;
        this.number = number;
    }

    @Override
    public boolean makeCall() {
        return true;
    }

    @Override
    public boolean receiveCall() {
        return true;
    }
}
