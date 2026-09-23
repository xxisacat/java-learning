package innertest.test;

public class Test {
    public static void main(String[] args) {
        int hp = 100;
        Fake f = new Fake(hp);
        hp = 200;
        System.out.println("Fake     -> " + f.peek());

        int[] arr = {100};
        FakeArr fa = new FakeArr(arr);
        arr[0] = 200;
        System.out.println("FakeArr  -> " + fa.peek());

        int[] arr2 = {100};
        FakeArr fb = new FakeArr(arr2);
        arr2 = new int[]{200};
        System.out.println("换门牌号 -> " + fb.peek());
    }
}
