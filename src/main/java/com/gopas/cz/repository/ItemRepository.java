package com.gopas.cz.repository;

import java.time.LocalDate;
import java.util.*;

import com.gopas.cz.model.Person;

public class ItemRepository {

    /**
     * Calling to the database for all persons in the system
     */
    public List<Person> findAllUsers() {
        List<Person> persons = new ArrayList<>();
        Person p1 = new Person("Pavel Seda", "pavelseda@email.cz", "lector", LocalDate.now());
        Person p2 = new Person("Pavel Seda", "pavelseda@email.cz", "lector", LocalDate.now());
        Person p3 = new Person("Pavel Seda", "pavelseda@email.cz", "lector", LocalDate.now());
        Person p4 = new Person("Pavel Seda", "pavelseda@email.cz", "lector", LocalDate.now());
        Person p5 = new Person("Pavel Seda", "pavelseda@email.cz", "lector", LocalDate.now());
        
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        persons.add(p5);
        
        return persons;
    }
}
