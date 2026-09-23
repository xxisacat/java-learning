package innertest.battle;

public class Arena {
    public static void duel(Hero a, Hero b, Attackable aWeapon, Attackable bWeapon, BattleListener[] listeners) {
        boolean aTurn = true;
        while (a.isAlive() && b.isAlive()) {
            Attackable weapon = aTurn ? aWeapon : bWeapon;
            Hero defender = aTurn ? b : a;
            int damage = weapon.attack();
            defender.takeDamage(damage);
            for (int i = 0; i < listeners.length; i++) {
                listeners[i].onHit(defender.getName(), damage);
            }
            aTurn = !aTurn;
        }
    }
}
