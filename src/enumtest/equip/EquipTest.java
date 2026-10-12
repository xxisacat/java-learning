package enumtest.equip;

public class EquipTest {
    public static void main(String[] args) {
        Weapon w1 = new Weapon("新手木剑", 10, Quality.COMMON);
        Weapon w2 = new Weapon("烈焰大剑", 40, Quality.RARE);
        Weapon w3 = new Weapon("龙牙", 60, Quality.EPIC);
        Quality[] qualities = Quality.values();
        System.out.println("---品质列表：---");
        for (int i = 0; i < qualities.length; i++) {
            System.out.println("【" + qualities[i].getRank() + "】" + " 倍率为：X" + qualities[i].getAtkRate());
        }
        System.out.println("---武器列表：---");
        System.out.println(w1.getName() + "\t【" + w1.getQuality().getRank() + " " + w1.getColor() + "】攻击力：" + w1.realAtk());
        System.out.println(w2.getName() + "\t【" + w2.getQuality().getRank() + " " + w2.getColor() + "】攻击力：" + w2.realAtk());
        System.out.println(w3.getName() + "\t【" + w3.getQuality().getRank() + " " + w3.getColor() + "】攻击力：" + w3.realAtk());
    }
}
