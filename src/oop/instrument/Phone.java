package oop.instrument;

public class Phone extends Terminal {
    public void call() {
        System.out.println("The " + brand + " can call");
    }

    public void send() {
        System.out.println("The " + brand + " can send");
    }
}
