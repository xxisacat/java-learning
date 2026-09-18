package oop.synthesize;

public class Test {
    public static void main(String[] args) {
        Undergraduate s1 = new Undergraduate("Iris", 21, "grade4");
        System.out.println(s1.getName() + " " + s1.getAge() + " " + s1.getGrade());
        s1.eat();
        s1.learn();
        s1.sleep();
        Postgraduate s2 = new Postgraduate("flower", 22, "grade1");
        System.out.println(s2.getName() + " " + s2.getAge() + " " + s2.getGrade());
        s2.eat();
        s2.learn();
        s2.sleep();
        Pcteacher t1 = new Pcteacher("morning", 30, "physics");
        System.out.println(t1.getName() + " " + t1.getAge() + " " + t1.getSubject());
        t1.eat();
        t1.teach();
        t1.sleep();
        Gecteacher t2 = new Gecteacher("Rosa", 32);
        System.out.println(t2.getName() + " " + t2.getAge());
        t2.eat();
        t2.teach();
        t2.sleep();
    }
}
