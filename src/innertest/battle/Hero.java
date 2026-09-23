package innertest.battle;

public class Hero {
    private String name;
    private int hp;

    public Hero(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public boolean isAlive() {
        return getHp() > 0;
    }

    public int takeDamage(int damage) {
        int before = this.hp;
        this.hp = Math.max(this.hp - damage, 0);
        return before - this.hp;
    }
}
