package interfacetest.hero;

public class Warrior extends Hero {
    public Warrior(String name, int hp) {
        super(name, hp);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " can attack the other party with a sword");
    }
}
