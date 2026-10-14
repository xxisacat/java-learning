package genericity;

public class Backpack<T> {
    //重写的最小泛型类,日期：2026.10.15
    private T[] items;
    private int size;

    public Backpack(int capacity) {
        items = (T[]) new Object[capacity];
        size = 0;
    }

    public boolean add(T item) {
        items[size] = item;
        size++;
        return true;
    }

    public T get(int index) {
        return items[index];
    }

    public int size() {
        return size;
    }
}
