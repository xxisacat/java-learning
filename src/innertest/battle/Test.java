package innertest.battle;

public class Test {
    public static void main(String[] args) {
        int start = 5;
        int step = 3;
        Hero hero = new Hero("hero", 100);
        Hero goblin = new Hero("goblin", 100);
        Attackable sword = new Attackable() {
            @Override
            public int attack() {
                return 10;
            }
        };
        Attackable dagger = new Attackable() {
            private int damage = start;
            //在start和step复制进的那一刻，后续如果在外部修改start和step就会产生分叉，因此effectively final，即看起来像是final的
            @Override
            public int attack() {
                int current = damage;
                damage += step;
                return current;
            }
        };
        BattleListener logger = new BattleListener() {
            @Override
            public void onHit(String target, int damage) {
                System.out.println("[LOG] " + target + " takes " + damage + " damage");
            }
        };
        Arena.duel(hero, goblin, sword, dagger, new BattleListener[]{logger, new BattleListener() {
            @Override
            public void onHit(String target, int damage) {
                if (damage >= 15) {
                    System.out.println("[WARN!] Critical hit!");
                }
            }
        }});
        System.out.println(hero.getName() + "'s HP: " + hero.getHp());
        System.out.println(goblin.getName() + "'s HP: " + goblin.getHp());
        if (hero.isAlive()) {
            System.out.println(hero.getName() + " wins!");
        } else {
            System.out.println(goblin.getName() + " wins!");
        }
    }
}
