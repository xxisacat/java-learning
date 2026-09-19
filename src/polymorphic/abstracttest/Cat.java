package polymorphic.abstracttest;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, int color) {
        super(name, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating fish");
    }

    public void catchMouse() {
        System.out.println(getName() + " is catching mouse");
    }
}
