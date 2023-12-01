package pl.pingwit.lesson15.task2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Objects;

public class Person {
    private final String name;
    private final String surname;
    private final LocalDate dateOfBirth;
    private final DayOfWeek favouriteDay;

    public Person(String name, String surname, LocalDate dateOfBirth, DayOfWeek favouriteDay) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.favouriteDay = favouriteDay;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public DayOfWeek getFavouriteDay() {
        return favouriteDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(dateOfBirth, person.dateOfBirth) && favouriteDay == person.favouriteDay;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, dateOfBirth, favouriteDay);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", favouriteDay=" + favouriteDay +
                '}';
    }
}
