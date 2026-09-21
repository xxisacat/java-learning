package interfacetest.test2;

public class Ppsportsman extends Sportsman implements Sayenglish {
    public Ppsportsman() {
    }

    public Ppsportsman(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn() {
        System.out.println(getName() + " is learning pingpong");
    }

    @Override

    public void say() {
        System.out.println(getName() + " should say English");
    }
}
