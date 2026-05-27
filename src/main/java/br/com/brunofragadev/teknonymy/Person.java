package br.com.brunofragadev.teknonymy;

import java.time.LocalDateTime;

public class Person {
    public Person parent;
    public final String name;
    public final Character sex;
    public final Person[] children;
    public final LocalDateTime dateOfBirth;
    public String teknonym = "";

    public Person(String name, Character sex, Person[] children, LocalDateTime dateOfBirth) {
        this.name = name;
        this.sex = sex;
        this.children = children;
        this.dateOfBirth = dateOfBirth;
    }
}
