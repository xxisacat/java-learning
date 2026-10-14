package genericity.filter;

import genericity.loot.Backpack;

public class Test {
    public static void main(String[] args) {
        System.out.println("--- 题B：战利品筛选 ---");
        Backpack<Item> loot = new Backpack<>(3);
        Backpack<Weapon> weapons = new Backpack<>(2);
        Weapon w1 = new Weapon("短剑", 60, 10);
        Gem gem = new Gem("红宝石", 200, "红");
        Weapon w2 = new Weapon("巨锤", 150, 35);
        loot.add(w1);
        loot.add(gem);
        loot.add(w2);
        weapons.add(w1);
        weapons.add(w2);
        System.out.print("战利品为：" + loot.size() + "件");
        System.out.println(",总价：" + FilterUtil.totalPrice(loot));
        System.out.print("武器背包为：" + weapons.size() + "件");
        System.out.println(",总价：" + FilterUtil.totalPrice(weapons));
        LootFilter<Item> rule = new LootFilter<>() {
            @Override
            public boolean test(Item item) {
                return item.getPrice() >= 100;
            }
        };
        Backpack<Item> filterLoot = FilterUtil.filter(loot, rule);
        Backpack<Weapon> filterWeapons = FilterUtil.filter(weapons, rule);
        System.out.print("按价格 >=100 筛战利品：" + filterLoot.size() + "件");
        System.out.println(",总价 " + FilterUtil.totalPrice(filterLoot));
        System.out.print("按价格 >=100 筛武器：" + filterWeapons.size() + "件");
        System.out.println(",第一件： " + filterWeapons.get(0).getName());
        System.out.print("原武器背包： ");
        for (int i = 0; i < weapons.size(); i++) {
            System.out.print(weapons.get(i).getName() + "\t");
        }
        System.out.println();
        System.out.print("筛选后武器背包： ");
        for (int i = 0; i < filterWeapons.size(); i++) {
            System.out.print(filterWeapons.get(i).getName() + "\t");
        }
    }
}
