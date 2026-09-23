package innertest.test;

public class FakeArr {
    final int[] val$hp;

    public FakeArr(int[] hp) {
        this.val$hp = hp;
    }

    public int peek() {
        return val$hp[0];
    }
}
