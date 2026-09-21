package interfacetest.hero;

public abstract class Hero {
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

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void hurt(int damage) {
        hp = Math.max(0, hp - damage);
        System.out.println(getName() + " received " + damage + " points of damage. Current HP: " + getHp());
    }

    public void addHp(int amount) {
        hp = Math.min(hp + amount, maxHp);
        System.out.println(getName() + "'s Current HP: " + getHp());
    }

    public abstract void attack();
}
