package polymorphic.abstracttest;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, int color) {
        super(name, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating bone");
    }

    public void lookHome() {
        System.out.println(getName() + " is looking home");
    }
}
