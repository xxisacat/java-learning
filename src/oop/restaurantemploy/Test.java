package oop.restaurantemploy;

public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager(142857, "Iris", 20000, 15000);
        System.out.println(manager.getWorknum() + " " + manager.getName() + " " + manager.getWage() + " " + manager.getBonuses());
        manager.work();
        manager.eat();
        Cooker cooker = new Cooker(999999, "flower", 20000);
        System.out.println(cooker.getWorknum() + " " + cooker.getName() + " " + cooker.getWage());
        cooker.work();
        cooker.eat();
    }
}
