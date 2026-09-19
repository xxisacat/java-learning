package polymorphic.abstracttest;

public class Test {
    public static void main(String[] args) {
        Cat c = new Cat("Tom", 1);
        c.eat();
        c.catchMouse();
        c.drink();
        Dog d = new Dog("Buddy", 2);
        d.eat();
        d.lookHome();
        d.drink();
    }
}
