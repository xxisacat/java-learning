package polymorphic.usevehicle;

public class Test {
    public static void main(String[] args) {
        Vehicle bike = new Bicycle("Giant", 20);
        Vehicle raceCar = new Car("Ferrari", 300);          //((Bicycle) bike).ringBell();    //Bicycle myBike = (Bicycle) bike;  myBike.ringBell();
        Person p = new Person("Iris", 20, "Female");
        p.use(bike);
        p.use(raceCar);
    }
}
