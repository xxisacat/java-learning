package interfacetest.hero;

public class SkillUtil {
    public static void healAll(Healable[] healers, int amount) {
        for (int i = 0; i < healers.length; i++) {
            healers[i].heal(amount);
        }
    }

    public static void showTalks(Talkable[] talkables) {
        for (int i = 0; i < talkables.length; i++) {
            System.out.println(talkables[i].talk());
        }
    }

    public static void silence(Talkable t) {
        t.setSilenced(true);
    }
}
