package oop.phone;

public class Test {
    public static void main(String[] args) {
        FirstPhone p1 = new FirstPhone();
        p1.call();
        SecondPhone p2 = new SecondPhone();
        p2.call();
        p2.send();
        ThirdPhone p3 = new ThirdPhone();
        p3.call();
        p3.send();
        p3.gaming();
    }
}
