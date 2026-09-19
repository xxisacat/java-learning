package polymorphic.abstracttest;

public class Test {
    public static void main(String[] args) {
        Cat c = new Cat("Tom", "white");
        c.eat();
        c.catchMouse();
        c.drink();
        Dog d = new Dog("Buddy", "blue");
        d.eat();
        d.lookHome();
        d.drink();
    }
}
