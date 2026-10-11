package innertest.innerdemo;

public class Test {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        Outer.SInner sinner = new Outer.SInner();
        new Outer().localDemo();
        inner.show();
        Outer.SInner.show();
    }
}
