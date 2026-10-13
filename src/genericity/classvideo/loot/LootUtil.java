package genericity.classvideo.loot;

public class LootUtil {
    public static <T> int transfer(Backpack<T> from, Backpack<T> to) {
        int moved = 0;
        while (from.size() > 0 && !to.isFull()) {
            T item = from.removeLast();
            to.add(item);
            moved++;
        }
        return moved;
    }
}
