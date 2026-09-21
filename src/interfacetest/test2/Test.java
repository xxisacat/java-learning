package interfacetest.test2;

public class Test {
    public static void main(String[] args) {
        Ppsportsman pps = new Ppsportsman("Iris", 18);
        Ppcoach ppc = new Ppcoach("Luosela", 20);
        Bsportsman bps = new Bsportsman("Xiangliao", 25);
        Bcoach bc = new Bcoach("Kakaluo", 30);
        pps.learn();
        pps.say();
        ppc.teach();
        ppc.say();
        bps.learn();
        bc.teach();
    }
}
