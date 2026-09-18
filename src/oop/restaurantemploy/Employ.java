package oop.restaurantemploy;

public class Employ {
    private int worknum;
    private String name;
    private double wage;

    public Employ() {
    }

    public Employ(int worknum, String name, double wage) {
        this.worknum = worknum;
        this.name = name;
        this.wage = wage;
    }

    public int getWorknum() {
        return worknum;
    }

    public void setWorknum(int worknum) {
        this.worknum = worknum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public void work() {
        System.out.println("Employ is working");
    }

    public void eat() {
        System.out.println(this.name + " is eating rice");
    }
}
