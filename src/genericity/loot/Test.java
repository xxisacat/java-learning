package genericity.loot;

public class Test {
    public static void main(String[] args) {
        Weapon w1 = new Weapon("新手剑", 10);
        Weapon w2 = new Weapon("新手枪", 20);
        Weapon w3 = new Weapon("潮汐终焉", 520);
        Weapon w4 = new Weapon("弓", 5);
        System.out.println("---题 A：通用背包---");
        Backpack<Weapon> bag = new Backpack<Weapon>(3);
        Backpack<Weapon> warehouse = new Backpack<Weapon>(2);
        System.out.println("容量为：" + bag.capacity());
        System.out.print("装入 Iris 的剑：" + bag.add(w1) + "  ");
        System.out.println("背包中物品数量为：" + bag.size());
        System.out.print("装入 Iris 的枪：" + bag.add(w2) + "  ");
        System.out.println("背包中物品数量为：" + bag.size());
        System.out.print("装入 曦 的杖：" + bag.add(w3) + "  ");
        System.out.println("背包中物品数量为：" + bag.size());
        System.out.println("背包已满：" + bag.isFull());
        System.out.print("装入 null 的弓：" + bag.add(w4) + "  ");
        System.out.println("背包中物品数量仍为：" + bag.size());
        System.out.println(bag.get(0).getName() + " " + bag.get(0).getAttack());
        System.out.println("---搬运---");
        System.out.println("搬运件数为：" + LootUtil.transfer(bag, warehouse));
        System.out.print("背包剩：" + bag.size());
        System.out.println(",仓库" + warehouse.size() + "件,仓库满了：" + warehouse.isFull());
        System.out.print("再搬一次：" + LootUtil.transfer(bag, warehouse));
        System.out.println(" 背包仍有：" + bag.size() + "件");
        System.out.println("---同一个类,另一种类型---");
        Backpack<String> materials = new Backpack<>(2);
        Backpack<String> materials1 = new Backpack<>(2);
        materials.add("铁矿石");
        materials.add("魔金");
        System.out.println("仓库中物品数量为：" + materials.size() + " 分别是" + materials.get(0) + "和" + materials.get(1));
        System.out.println("装入 兽皮 ->" + materials.add("兽皮"));
        LootUtil.transfer(materials, materials1);
        System.out.println("搬运后：源背包" + materials.size() + "件/目标背包" + materials1.size() + "件");
    }
}
