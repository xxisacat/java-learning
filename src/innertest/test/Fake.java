package innertest.test;

public class Fake {
    final int val$hp;

    public Fake(int hp) {
        this.val$hp = hp;
    }

    public int peek() {
        return val$hp;
    }
}
