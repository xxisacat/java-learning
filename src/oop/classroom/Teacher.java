package oop.classroom;

public class Teacher extends Person {
    String subject;

    public void teaching() {
        System.out.println("The " + this.name + " are teaching");
    }
}
