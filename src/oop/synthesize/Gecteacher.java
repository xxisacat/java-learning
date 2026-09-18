package oop.synthesize;

public class Gecteacher extends Person {
    public Gecteacher() {
    }

    public Gecteacher(String name, int age) {
        super(name, age);
    }

    public void teach() {
        System.out.println(this.getName() + " is teaching general education course ");
    }
}
