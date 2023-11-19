package pl.pingwit.lesson12.task4;

public class ArrayPersonReverser implements PersonReverser {
    @Override
    public Person reversPerson(Person person) {
        char[] charName = person.getName().toCharArray();
        char[] charSurname = person.getSurname().toCharArray();

        StringBuilder revertedName = new StringBuilder();
        for (int i = charName.length - 1; i >= 0; i--) {
            revertedName.append(charName[i]);
        }

        StringBuilder revertedSurname = new StringBuilder();
        for (int i = charSurname.length - 1; i >= 0; i--) {
            revertedSurname.append(charSurname[i]);
        }
        return new Person(revertedName.toString(), revertedSurname.toString());
    }
}