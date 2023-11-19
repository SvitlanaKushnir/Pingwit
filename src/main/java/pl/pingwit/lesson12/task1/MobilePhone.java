package pl.pingwit.lesson12.task1;

public class MobilePhone extends AbstractPhone{
    private final Integer MemoryCapacity;

    public MobilePhone(String model, String number, Integer memoryCapacity, AccumulatorType nickel) {
        super(model, number);
        MemoryCapacity = memoryCapacity;
    }

    public Integer getMemoryCapacity() {
        return MemoryCapacity;
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
        return "MobilePhone{" +
                "MemoryCapacity=" + MemoryCapacity +
                '}';
    }
}
