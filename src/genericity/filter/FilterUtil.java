package genericity.filter;

import genericity.loot.Backpack;

public class FilterUtil {
    public static <T> Backpack<T> filter(Backpack<T> bag, LootFilter<? super T> rule) {
        Backpack<T> filteredBag = new Backpack<>(bag.size());
        for (int i = 0; i < bag.size(); i++) {
            T item = bag.get(i);
            if (rule.test(item)) {
                filteredBag.add(item);
            }
        }
        return filteredBag;
    }

    public static int totalPrice(Backpack<? extends Item> bag) {
        int total = 0;
        for (int i = 0; i < bag.size(); i++) {
            total += bag.get(i).getPrice();
        }
        return total;
    }
}

