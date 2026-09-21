package interfacetest.test1;

public class Rabbit extends Animal {

    public Rabbit(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating carrots");
    }
}
