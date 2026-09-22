package innertest.test;

public class Hero {
        String name = "外面的英雄";
        void demo() {
            Talkable t = new Talkable() {
                String name = "匿名内部类";

                @Override
                public String talk() {
                    return this.name;
                }
            };
            System.out.println(t.talk());
        }

}
