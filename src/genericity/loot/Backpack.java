package genericity.loot;

public class Backpack<T> {
    private T[] items;
    private int size;

    public Backpack(int capacity) {
        items = (T[]) new Object[capacity];
        size = 0;
    }

    public boolean add(T item) {
        if (isFull()) {
            return false;
        }
        items[size] = item;
        size++;
        return true;
    }

    public T get(int index) {
        return items[index];
    }

    public T removeLast() {
        size--;
        return items[size];
    }

    public int size() {
        return size;
    }

    public boolean isFull() {
        return size == items.length;
    }

    public int capacity() {
        return items.length;
    }
}


