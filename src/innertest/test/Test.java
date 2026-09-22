package innertest.test;

public class Test {
    public static void main(String[] args) {
        new Hero().demo();
        int[] hp = {100};
        Attackable a = new Attackable() {
            @Override
            public int attack() {
                return 10;
            }
        };

        Healable h = new Healable() {
            @Override
            public int heal(int amount) {
                return hp[0] + amount;
            }
        };
        System.out.println(h.heal(50));
        hp[0] = 200;
        System.out.println(h.heal(50));

        Enemy goblin = new Enemy("哥布林") {
            @Override
            public void attack() {
                System.out.println(getName() + " 挥刀");
            }
        };
        goblin.attack();
        System.out.println(goblin.getClass().getName());

        Enemy slime = new Enemy("史莱姆") {
            @Override
            public void attack() {
                System.out.println(getName() + " 攻击");
            }
        };
        System.out.println(goblin == slime);
        System.out.println(slime.getClass().getName());
    }
}
