package lambdasstreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import database.jdbc.Person;

public class UsePerson {
    private List<String> names = Arrays.asList("Goku", "Gohan", "trunks",
            "Vegeta", "pikalo", "Gotens");

    public List<Person> createPersonList () {
        return names.stream()
                .map(name -> new Person(name))
                .collect(Collectors.toList());
    }

    public Person[] createPersonArray() {
        return names.stream()
                .map(Person::new)
                .toArray(Person[]::new);
    }

    public List<Person> createPersonUsingNew() {
        return names.stream()
                .map(Person::new)
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
    }

    public static void main(String[] args) {
        UsePerson usePerson = new UsePerson();
        System.out.println(usePerson.createPersonList());
        System.out.println(usePerson.createPersonUsingNew());
        Arrays.stream(usePerson.createPersonArray())
                .forEach(System.out::println);
    }


}
