package org.example.algorithems.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }
}

class PersonService {
    static List<Person> getPersons(List<Person> persons) {
        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                // return p1.getName().compareTo(p2.getName());
                return p2.getAge() - p1.getAge();
            }
        });
        return persons;
    }

    static List<Person> getPersonsLambda(List<Person> persons) {
        Collections.sort(persons, (p1, p2) -> p1.getName().compareTo(p2.getName()));
        return persons;
    }
}
public class SortingLambda {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("A", 10));
        persons.add(new Person("B", 20));
        persons.add(new Person("S", 30));
        persons.add(new Person("D", 40));
        persons.add(new Person("C", 50));
        List<Person> sortedPersons = PersonService.getPersons(persons);
        List<Person> lambdaSortedPersons = PersonService.getPersonsLambda(persons);
        for(Person person: lambdaSortedPersons) {
            System.out.println(person.getName());
        }
    }
}
