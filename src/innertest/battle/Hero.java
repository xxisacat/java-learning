package innertest.battle;

public class Hero {
    private String name;
    private int hp;
    private int maxHp;

    public Hero(String name, int hp) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void isAlive() {
        if (getHp() > 0)
            System.out.println(getName() + " is alive");
        else
            System.out.println(getName() + " is dead");
    }

    public int takeDamage(int damage) {
        return Math.max(getHp() - damage, 0);
    }
}
