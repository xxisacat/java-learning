package oop.synthesize;

public class Pcteacher extends Person {
    private String subject;

    public Pcteacher() {
    }

    public Pcteacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void teach() {
        System.out.println(this.getName() + " is teaching " + this.subject);
    }
}
