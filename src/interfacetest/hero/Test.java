package interfacetest.hero;

public class Test {
    public static void main(String[] args) {
        Warrior w1 = new Warrior("Snow", 300);
        Warrior w2 = new Warrior("Wind", 150);
        Priest p1 = new Priest("Morning", 140);
        Bard b1 = new Bard("Iris", 170);
        p1.hurt(70);
        b1.hurt(70);
        Healable[] healers = {p1, b1};
        Talkable[] talkables = {b1};
        Hero[] heroes = {w1, w2, p1, b1};
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].attack();
        }
        SkillUtil.healAll(healers, 20);
        SkillUtil.showTalks(talkables);
        SkillUtil.silence(b1);
        SkillUtil.showTalks(talkables);
        System.out.println(healers[1] == talkables[0]);
    }
}
