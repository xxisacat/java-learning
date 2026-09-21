package interfacetest.test2;

public class Bcoach extends Coach {
    public Bcoach() {
    }

    public Bcoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println(getName() + " is teaching basketball");
    }
}
