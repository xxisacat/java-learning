package interfacetest.test2;

public class PingpongCoach extends Coach implements SayEnglish {
    public PingpongCoach() {
    }

    public PingpongCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println(getName() + " is teaching pingpong");
    }

    @Override
    public void speakEnglish() {
        System.out.println(getName() + " should say English");
    }
}
