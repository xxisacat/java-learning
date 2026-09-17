package oop.calculateprice;

public class Test {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.name = "iPhone 18 pro max";
        p1.price = 12999;
        System.out.println(p1.payment());
        Pad p2 = new Pad();
        p2.name = "iPad Pro";
        p2.price = 10999;
        System.out.println(p2.payment());
        Computer c = new Computer();
        c.name = "MacBook Pro";
        c.price = 14999;
        System.out.println(c.payment());
    }
}
