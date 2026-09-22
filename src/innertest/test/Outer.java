package innertest.test;

public class Outer {
    private static int x = 10;

    class Inner {                 // ① 成员内部类
        void show() {
            System.out.println("Inner 看到 " + x);
        }
    }

    static class SInner {         // ② 静态内部类
        void show() {
            System.out.println("SInner 看到 " + x);
        }
    }

    void localDemo() {            // ③ 局部内部类
        class Local {
            void show() {
                System.out.println("Local 看到 " + x);
            }
        }
        new Local().show();
    }
}
