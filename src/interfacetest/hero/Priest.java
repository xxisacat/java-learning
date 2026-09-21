package interfacetest.hero;

public class Priest extends Hero implements Healable {
    public Priest(String name, int hp) {
        super(name, hp);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " can attack the other party with a staff");
    }

    @Override
    public void heal(int amount) {
        System.out.println(getName() + " heals for " + amount + " HP");
        addHp(amount);
    }
}
