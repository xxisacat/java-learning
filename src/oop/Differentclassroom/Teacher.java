package oop.Differentclassroom;

public class Teacher extends Person {
    private String subject;

    public Teacher() {
    }

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
        System.out.println(name + " " + age + " " + subject);
    }
}
