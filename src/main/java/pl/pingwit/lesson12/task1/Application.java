package pl.pingwit.lesson12.task1;

public class Application {
    public static void main(String[] args) {
        RotaryPhone rotaryPhone = new RotaryPhone("oldestPhone","0412-355-93-00","White", AccumulatorType.LITHIUM);
        RadioPhone radioPhone = new RadioPhone("oldPhone", "0412-123-11-00", "Pink", AccumulatorType.NICKEL);
        MobilePhone mobilePhone = new MobilePhone("Nokia", "+380931231122", 8, AccumulatorType.NICKEL);
        SmartPhone smartPhone = new SmartPhone("iPhone", "+380935677788",256, AccumulatorType.NICKEL);

        System.out.println("Is rotary phone can make a call? " + rotaryPhone.makeCall());
        System.out.println("Can it receive a call? " + rotaryPhone.receiveCall());
        System.out.println("Is radio phone can make a call? " + radioPhone.makeCall());
        System.out.println("Can it receive a call? " + radioPhone.receiveCall());
        System.out.println("Is mobile phone can make a call? " + mobilePhone.makeCall());
        System.out.println("Can it receive a call? " + mobilePhone.receiveCall());
        System.out.println("Is smartphone can make a call? " + smartPhone.makeCall());
        System.out.println("Can it receive a call? " + smartPhone.receiveCall());
    }
}
