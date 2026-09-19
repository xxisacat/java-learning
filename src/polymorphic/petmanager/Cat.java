package polymorphic.petmanager;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(int age, String color, String something) {
        super(age, color, something);
    }

    @Override
    public void eat(String something) {
        System.out.println("Cat is eating " + something + ".");
    }

    public void catchMouse() {
        System.out.println("Cat is catching the mouse.");
    }
}
