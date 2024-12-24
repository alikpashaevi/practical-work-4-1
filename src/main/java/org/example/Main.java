package org.example;

import org.example.people.Person;
import org.example.people.Programmer;
import org.example.people.Student;

public class Main {
    public static void main(String[] args) {
        Person student = new Student("Alikhan", 20, 1,"BTU", "IT");
        Person programmer = new Programmer("Alikhan", 20, "Java", 1);

        student.printDetails();
        programmer.printDetails();
    }
}