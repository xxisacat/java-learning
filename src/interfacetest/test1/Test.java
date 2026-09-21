package interfacetest.test1;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.eat();
        Frog frog = new Frog("Frogger");
        frog.eat();
        Rabbit rabbit = new Rabbit("Bunny");
        rabbit.eat();
        Swim[] swimmers = {dog, frog};
        for (int i = 0; i < swimmers.length; i++) {
            swimmers[i].swim();
        }
    }
}
