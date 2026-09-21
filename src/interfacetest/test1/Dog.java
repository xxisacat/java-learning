package interfacetest.test1;

public class Dog extends Animal implements Swim {

    public Dog(String name) {
        super(name);
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
