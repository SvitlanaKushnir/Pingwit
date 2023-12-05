package pl.pingwit.lesson15.task2;

import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PersonParser {
    public Person[] parse(String text) {
        String[] personStrings = text.split(";");
        Person[] persons = new Person[personStrings.length];
        for (int i = 0; i < personStrings.length; i++) {
            persons[i] = parsePerson(personStrings[i]); // выделила private методы - оч хорошо
        }
        return persons;
    }

    private Person parsePerson(String text) {
        String[] fields = text.split(",");
        String name = fields[0];
        String surname = fields[1].trim();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-dd-MM");
        LocalDate dateOfBirth = LocalDate.parse(fields[3].trim(), formatter);

        DayOfWeek favouriteDay = null;
        try {
            favouriteDay = DayOfWeek.of(Integer.parseInt(fields[2].trim()));
        } catch (DateTimeException e) {
            System.out.println("An error occurred -  " + e.getMessage());
        }

        return new Person(name,
                surname,
                dateOfBirth,
                favouriteDay);
    }
}