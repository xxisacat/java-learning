package api.battlelog;

public class Test {
    public static void main(String[] args) {
        String[] weapons = {"短剑", "巨锤", "法杖", "匕首", "弓"};
        int[] damage = {60, 150, 90, 40, 120};
        int total = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < weapons.length; i++) {
            total = total + damage[i];
            sb.append("第").append(i + 1).append("回合：").append(weapons[i]).append("造成").append(damage[i]).append("伤害；");
        }
        System.out.println(sb.deleteCharAt(sb.length() - 1).append("，总伤害").append(total));
        System.out.println("倒带：" + new StringBuilder(sb.toString()).reverse());
    }
}
