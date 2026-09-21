package interfacetest.test2;

public class BasketballSportsman extends Sportsman {
    public BasketballSportsman() {
    }

    public BasketballSportsman(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn() {
        System.out.println(getName() + " is learning basketball");
    }
}
