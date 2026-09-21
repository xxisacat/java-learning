package interfacetest.test2;

public class Ppcoach extends Coach implements Sayenglish {
    public Ppcoach() {
    }

    public Ppcoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println(getName() + " is teaching pingpong");
    }

    @Override
    public void say() {
        System.out.println(getName() + " should say English");
    }
}
