package genericity.filter;

public interface LootFilter<T> {
    boolean test(T item);
}
