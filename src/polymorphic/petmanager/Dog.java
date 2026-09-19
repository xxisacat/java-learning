package polymorphic.petmanager;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(int age, String color, String something) {
        super(age, color, something);
    }

    @Override
    public void eat(String something) {
        System.out.println("Dog is eating " + something + ".");
    }

    public void lookHome() {
        System.out.println("Dog is looking after the home.");
    }
}
