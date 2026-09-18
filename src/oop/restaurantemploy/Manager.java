package oop.restaurantemploy;

public class Manager extends Employ {
    private double bonuses;

    public Manager() {
    }

    public Manager(int worknum, String name, double wage, double bonuses) {
        super(worknum, name, wage);
        this.bonuses = bonuses;
    }

    public double getBonuses() {
        return bonuses;
    }

    public void setBonuses(double bonuses) {
        this.bonuses = bonuses;
    }

    @Override
    public void work() {
        System.out.println(getName() + " is managing");
    }
}
