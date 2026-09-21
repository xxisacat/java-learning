package interfacetest.test2;

public class Test {
    public static void main(String[] args) {
        PingpongSportsman ppSportsman = new PingpongSportsman("Iris", 18);
        PingpongCoach ppCoach = new PingpongCoach("Luosela", 20);
        BasketballSportsman bbSportsman = new BasketballSportsman("Xiangliao", 25);
        BasketballCoach bbCoach = new BasketballCoach("Kakaluo", 30);
        ppSportsman.learn();
        ppCoach.teach();
        bbSportsman.learn();
        bbCoach.teach();
        SayEnglish[] speakers = {ppCoach, ppSportsman};
        for (int i = 0; i < speakers.length; i++) {
            speakers[i].speakEnglish();
        }
    }
}
