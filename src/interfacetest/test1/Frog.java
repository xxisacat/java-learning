package interfacetest.test1;

public class Frog extends Animal implements Swim {

    public Frog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating insects");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " can breaststroke");
    }

}
