package oop.phone;

public class ThirdPhone extends SecondPhone {
    @Override
    public void call() {
        System.out.println("Owing to the technology, the call become to video");
    }

    public void gaming() {
        System.out.println("Technology reform, now, the phone can play game");
    }

    public static class Test {
    }
}
