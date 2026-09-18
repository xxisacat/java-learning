package oop.differentclassroom;

public class Test {
    public static void main(String[] args) {
        Student s = new Student("Iris", 18, "grade 4");
        Teacher t = new Teacher("morning", 22, "physics");
        System.out.println(s.getName() + " " + s.getAge() + " " + s.getGrade());
        s.introduce();
        System.out.println(t.getName() + " " + t.getAge() + " " + t.getSubject());
        t.introduce();
    }
}
