package genericity.filter;

public class Weapon extends Item {
    private int attack;

    public Weapon(String name, int price, int attack) {
        super(name, price);
        this.attack = attack;
    }

    public int getAttack() {
        return attack;
    }
}
