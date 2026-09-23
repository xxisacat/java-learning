package innertest.battle;

public class Test {
    public static void main(String[] args) {
        Hero hero = new Hero("Hero", 100);
        Hero goblin = new Hero("goblin", 100);
        Attackable sword = new Attackable() {
            @Override
            public int attack() {
                return 10;
            }
        };
        Attackable dagger = new Attackable() {
            private int damage = 5;

            @Override
            public int attack() {
                int current = damage;
                damage += 3;
                return current;
            }
        };
        BattleListener logger = new BattleListener() {
            @Override
            public void onHit(String target, int damage) {
                System.out.println(target + " takes " + damage + " damage");
            }
        };
        Arena.duel(hero, goblin, sword, dagger, new BattleListener[]{logger, new BattleListener() {
            @Override
            public void onHit(String target, int damage) {
                if (damage >= 15) {
                    System.out.println("Critical hit!");
                }
            }
        }});
        if (hero.isAlive()) {
            System.out.println(hero.getName() + " wins!" + hero.getHp());
            System.out.println(goblin.getName() + " loses " + goblin.getHp());
        } else {
            System.out.println(goblin.getName() + " wins!" + goblin.getHp());
            System.out.println(hero.getName() + " loses " + hero.getHp());
        }
    }
}
