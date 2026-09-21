package interfacetest.hero;

public class Bard extends Hero implements Healable, Talkable {
    private boolean silenced;

    public Bard(String name, int hp) {
        super(name, hp);
    }

    @Override
    public void setSilenced(boolean silenced) {
        this.silenced = silenced;
    }

    @Override
    public void attack() {
        System.out.println(getName() + " can attack the other party with a guitar");
    }

    @Override
    public void heal(int amount) {
        System.out.println(getName() + " heals for " + amount + " HP");
        addHp(amount);
    }

    @Override
    public String talk() {
        if (silenced) {
            return getName() + ": ...";
        }
        return getName() + ": Hello! Can you hear me?";
    }
}
