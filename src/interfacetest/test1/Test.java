package interfacetest.test1;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", "Golden Retriever");
        dog.eat();
        dog.swim();
        Frog frog = new Frog("Buddy", "Golden Retriever");
        frog.eat();
        frog.swim();
        Rabbit rabbit = new Rabbit("Buddy", "Golden Retriever");
        rabbit.eat();
    }
}
