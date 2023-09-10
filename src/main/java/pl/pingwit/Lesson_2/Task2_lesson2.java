package pl.pingwit.Lesson_2;

public class Task2_lesson2 {
    public static void main(String[] args) {
        String myString1 = "77";
        Byte myParsedByte = Byte.parseByte(myString1);
        System.out.println(myParsedByte);

        String myString2 = "12587";
        Short myParsedShort = Short.parseShort(myString2);
        System.out.println(myParsedShort);

        String myString3 = "-78945627";
        Integer myParsedIteger = Integer.parseInt(myString3);
        System.out.println(myParsedIteger);

        String myString4 = "-123.6789";
        Float myParsedFloat = Float.parseFloat(myString4);
        System.out.println(myParsedFloat);

        String myString5 = "-8965.876655";
        Double myParsedDouble = Double.parseDouble(myString5);
        System.out.println(myParsedDouble);


    }
}


