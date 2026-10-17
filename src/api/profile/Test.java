package api.profile;

public class Test {
    public static void main(String[] args) {
        String raw = "  xXisaCat | 短剑 | 60 | 珍稀 ";
        String[] parts = raw.split("\\|");
        String nick = parts[0].trim().toLowerCase();
        String weapon = parts[1].trim();
        int price = Integer.parseInt(parts[2].trim());
        String rarity = parts[3].trim();
        System.out.println("玩家：" + nick);
        System.out.print("武器：" + weapon + " / ");
        System.out.println("售价：" + price);
        if (rarity.equals("珍稀")) {
            System.out.println("品质：★ " + rarity);
        } else {
            System.out.println("品质：" + rarity);
        }
        System.out.println("昵称长度 " + nick.length() + "，首字母 " + nick.charAt(0));
    }
}