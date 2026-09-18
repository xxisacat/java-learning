package oop.Differentclassroom;

public class Student extends Person {
    private String grade;

    public Student() {
    }

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
        System.out.println(name + " " + age + " " + grade);
    }
}
