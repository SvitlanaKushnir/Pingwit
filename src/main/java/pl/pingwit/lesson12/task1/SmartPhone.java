package pl.pingwit.lesson12.task1;

public class SmartPhone extends AbstractPhone{
    private final Integer memoryCapacity;

    public SmartPhone(String model, String number, Integer memoryCapacity, AccumulatorType nickel) {
        super(model, number);
        this.memoryCapacity = memoryCapacity;
    }

    public Integer getMemoryCapacity() {
        return memoryCapacity;
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
        return "SmartPhone{" +
                "memoryCapacity=" + memoryCapacity +
                '}';
    }
}
