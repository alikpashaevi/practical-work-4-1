package org.example.people;

public class Programmer extends Person{
    String programmingLanguage;
    int yearsOfExperience;

    public Programmer(String name, int age, String programmingLanguage, int yearsOfExperience) {
        setName(name);
        setAge(age);
        setProgrammingLanguage(programmingLanguage);
        setYearsOfExperience(yearsOfExperience);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void printDetails() {
        System.out.println("programmer info: ");
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("programming language: " + programmingLanguage);
        System.out.println("years of experience: " + yearsOfExperience);
    }
}
