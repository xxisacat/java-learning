package oop.restaurantemploy;

public class Cooker extends Employ {
    public Cooker() {
    }

    public Cooker(int worknum, String name, double wage) {
        super(worknum, name, wage);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is cooking");
    }
}
