package org.example.Entity;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @org.junit.jupiter.api.Test
    void getName() {
        Person person = new Person("Gabriel", "male", "gaba", "GB", 17);
        assertEquals("Gabriel", person.getName());
    }

    @org.junit.jupiter.api.Test
    void setName() {
        Person person = new Person("Gabriel", "male", "gaba", "GB", 17);
        person.setName("Joseph");
        assertEquals("Joseph", Person.getName());

    }

    @org.junit.jupiter.api.Test
    void getGender() {
        Person person = new Person("Gabriel", "male", "gaba", "GB", 17);
        assertEquals("male", person.getGender());
    }

    @org.junit.jupiter.api.Test
    void setGender() {
        Person person = new Person("Gabriel", "male", "gaba", "GB", 17);
        person.setGender("female");
        assertEquals("female", Person.getGender());
    }

    @org.junit.jupiter.api.Test
    void getEmail() {
        Person person = new Person("Gabriel", "male", "gaba", "GB", 17);
        assertEquals("gaba", person.getEmail());
    }

    @org.junit.jupiter.api.Test
    void setEmail() {Person person = new Person("Gabriel", "male", "gaba", "GB", 17);
        person.setEmail("gabson");
        assertEquals("gabson", Person.getEmail());
    }

    @org.junit.jupiter.api.Test
    void getAddress() {
        Person person = new Person("Gabriel", "male", "gaba", "GB", 17);
        assertEquals("GB", person.getAddress());

    }

    @org.junit.jupiter.api.Test
    void setAddress() {Person person = new Person("Gabriel", "male", "gaba", "GB", 17);
        person.setAddress("AB");
        assertEquals("AB", Person.getAddress());
    }

    @org.junit.jupiter.api.Test
    void getAge() {
        Person person = new Person("Gabriel", "male", "gaba", "GB", 17);
        assertEquals(17, person.getAge());
    }

    @org.junit.jupiter.api.Test
    void setAge() {Person person = new Person("Gabriel", "male", "gaba", "GB", 17);
        person.setAge(11);
        assertEquals(11, Person.getAge());
    }
}