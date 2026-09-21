package interfacetest.test2;

public class PingpongSportsman extends Sportsman implements SayEnglish {
    public PingpongSportsman() {
    }

    public PingpongSportsman(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn() {
        System.out.println(getName() + " is learning pingpong");
    }

    @Override
    public void speakEnglish() {
        System.out.println(getName() + " should say English");
    }
}
