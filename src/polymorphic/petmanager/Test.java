package polymorphic.petmanager;

public class Test {
    public static void main(String[] args) {
        Animal a1 = new Cat(1, "colorful");
        Animal a2 = new Dog(2, "blue");
        Person p = new Person("Iris", 21);
        p.keepPet(a1, "fish");
        ((Cat) a1).catchMouse();
        p.keepPet(a2, "bone");
        ((Dog) a2).lookHome();
    }
}
