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
        if (getHp() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void takeDamage(int damage) {
        this.hp = Math.max(this.hp - damage, 0);
    }
}
