package innertest.innerdemo;

public class Test {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();//创建成员内部类对象
        new Outer.SInner();// 静态内部类,不需要外部类也能创建
        new Outer().localDemo();//调用局部内部类方法
        inner.show();//调用成员内部类方法
        Outer.SInner.show();//用静态内部类类名调用
        new Outer().peek(inner);
    }
}
