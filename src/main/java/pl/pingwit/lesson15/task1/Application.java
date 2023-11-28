package pl.pingwit.lesson15.task1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Application {
    public static void main(String[] args) {
        //01-Mar-2022, Mar-01-2022, 2022-01-Mar, 01-March-2022

        String date1 = "2023-17-01";
        String date2 = "23-2022-01";
        String date3 = "15-07-2022";

        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("dd-MMM-yyyy", Locale.ENGLISH);
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("MMM-dd-yyyy", Locale.ENGLISH);
        DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("yyyy-dd-MMM", Locale.ENGLISH);
        DateTimeFormatter dateTimeFormatter4 = DateTimeFormatter.ofPattern("dd-MMMM-yyyy", Locale.ENGLISH);

        System.out.println("-----2023-17-01-----");
        DateTimeFormatter pattern1 = DateTimeFormatter.ofPattern("yyyy-dd-MM");
        LocalDate parsedDate1 = LocalDate.parse(date1, pattern1);
        String parsedDateFormatter1 = parsedDate1.format(dateTimeFormatter1);
        System.out.println(parsedDateFormatter1);
        String parsedDateFormatter2 = parsedDate1.format(dateTimeFormatter2);
        System.out.println(parsedDateFormatter2);
        String parsedDateFormatter3 = parsedDate1.format(dateTimeFormatter3);
        System.out.println(parsedDateFormatter3);
        String parsedDateFormatter4 = parsedDate1.format(dateTimeFormatter4);
        System.out.println(parsedDateFormatter4);

        System.out.println("-----23-2022-01-----");
        DateTimeFormatter pattern2 = DateTimeFormatter.ofPattern("dd-yyyy-MM");
        LocalDate parsedDate2 = LocalDate.parse(date2, pattern2);
        String parsedDateFormatter6 = parsedDate2.format(dateTimeFormatter1);
        System.out.println(parsedDateFormatter6);
        String parsedDateFormatter7 = parsedDate2.format(dateTimeFormatter2);
        System.out.println(parsedDateFormatter7);
        String parsedDateFormatter8 = parsedDate2.format(dateTimeFormatter3);
        System.out.println(parsedDateFormatter8);
        String parsedDateFormatter9 = parsedDate2.format(dateTimeFormatter4);
        System.out.println(parsedDateFormatter9);

        System.out.println("-----15-07-2022-----");
        DateTimeFormatter pattern3 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate parsedDate3 = LocalDate.parse(date3, pattern3);
        String parsedDateFormatter10 = parsedDate3.format(dateTimeFormatter1);
        System.out.println(parsedDateFormatter10);
        String parsedDateFormatter11 = parsedDate3.format(dateTimeFormatter2);
        System.out.println(parsedDateFormatter11);
        String parsedDateFormatter12 = parsedDate3.format(dateTimeFormatter3);
        System.out.println(parsedDateFormatter12);
        String parsedDateFormatter13 = parsedDate3.format(dateTimeFormatter4);
        System.out.println(parsedDateFormatter13);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy.mm.dd, ms.ss.mm.hh");
        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);
    }
}
