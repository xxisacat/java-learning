package innertest.test;

public abstract class Enemy {
    private final String name;

    protected Enemy(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void attack();
}
