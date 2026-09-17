package oop.instrument;

public class Test {
    public static void main(String[] args) {
        Android p1 = new Android();
        p1.brand = "Xiaomi 18 Fold";
        p1.price = 14999;
        System.out.println(p1.brand + "\t" + p1.price);
        p1.call();
        p1.send();
        p1.NFC();
        Apple p2 = new Apple();
        p2.brand = "Iphone 18 pro max";
        p2.price = 12999;
        System.out.println(p2.brand + "\t" + p2.price);
        p2.call();
        p2.send();
        Computer c1 = new Computer();
        c1.brand = "ROG";
        c1.price = 49999;
        System.out.println(c1.brand + "\t" + c1.price);
        c1.coding();
    }
}
