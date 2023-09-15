package pl.pingwit.lesson3;

// из названий классов Task3Lesson... плиз убери постфикс Lesson, тк информация об уроке уже есть в названии пакета
public class Task3Lesson3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 256; i = i * 2) {
            sum += i;
        }
        System.out.println(sum);
    }
}
