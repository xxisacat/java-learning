package interfacetest.test2;

public class Bsportsman extends Sportsman {
    public Bsportsman() {
    }

    public Bsportsman(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn() {
        System.out.println(getName() + " is learning basketball");
    }
}
