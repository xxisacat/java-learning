package enumtest.state;

public class StateTest {
    public static void main(String[] args) {
        Player knight = new Player("Iris");
        System.out.println(knight.getState());
        System.out.println(knight.canMove());
        knight.attack();
        knight.attack();
        knight.hurt(30);
        knight.recover();
        knight.hurt(100);
        knight.attack();
        knight.hurt(100);
    }
}
