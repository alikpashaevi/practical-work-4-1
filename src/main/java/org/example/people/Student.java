package org.example.people;

public class Student extends Person {
    int studentId;
    String university;
    String program;

    public Student(String name, int age, int studentId, String university, String program) {
        setName(name);
        setAge(age);
        setStudentId(studentId);
        setUniversity(university);
        setProgram(program);
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

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public void printDetails() {
        System.out.println("Student info: ");
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("Student Id: " + studentId);
        System.out.println("university: " + university);
        System.out.println("program: " + program);
    }
}
