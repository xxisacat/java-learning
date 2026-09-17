package oop.classroom;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Iris";
        s1.age = 18;
        s1.grade = "大四";
        s1.study();
        Teacher t1 = new Teacher();
        t1.name = "morning";
        t1.age = 22;
        t1.subject = "physics";
        t1.teaching();
    }
}
