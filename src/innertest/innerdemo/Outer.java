package innertest.innerdemo;

public class Outer {
    private String secret = "外层的秘密";

    class Inner {
        private String tag = "tag";

        void show() {
            System.out.println(secret);
            System.out.println(tag);
        }
    }

    static class SInner {
        static void show() {
            System.out.println("不能碰secret");//因为SInner是静态内部类，并没有挂在Outer对象上
        }
    }

    void localDemo() {
        class Local {
            void show() {
                System.out.println(secret);
            }
        }
        new Local().show();//这个Local类只能在localDemo方法内使用,也不能在类体Local中使用
    }

    void peek(Inner in) {
        System.out.println(in.tag);//能进行编译，因为Inner本来就是Outer的内部类
    }
}
