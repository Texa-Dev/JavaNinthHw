package task1;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Artem", 35, Gender.MALE));
        persons.add(new Person("Alla", 30, Gender.FEMALE));
        persons.add(new Person("Daniil", 17, Gender.MALE));
        persons.add(new Person("Tania", 65, Gender.FEMALE));
        persons.add(new Person("Valera", 62, Gender.MALE));
        persons.add(new Person("Nina", 70, Gender.FEMALE));
        persons.add(new Person("Sergei", 45, Gender.MALE));
        persons.add(new Person("Aleksei", 27, Gender.MALE));
        persons.add(new Person("Vlad", 90, Gender.MALE));

        Stream<Person> personStream = persons.stream();

        Stream<Person> workable = personStream.filter(
                person -> person.getAge() >= 18 && (person.getAge() <= 60 && person.getGender() == Gender.FEMALE ||
                        person.getAge() <= 65 && person.getGender() == Gender.MALE));

        workable.forEach(System.out::println);

    }
}