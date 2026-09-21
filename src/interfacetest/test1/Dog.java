package interfacetest.test1;

public class Dog extends Animal implements Swim {
    public Dog() {
    }

    public Dog(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating bones");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " can doggy paddle");
    }
}
