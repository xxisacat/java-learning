package innertest.test;

public interface Attackable {
    int attack();

    default int range() {
        return 1;
    }
}
