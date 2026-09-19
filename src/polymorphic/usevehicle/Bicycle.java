package polymorphic.usevehicle;

public class Bicycle extends Vehicle {
    public Bicycle() {
    }

    public Bicycle(String brand, double speed) {
        super(brand, speed);
    }

    public void ringBell() {
        System.out.println(getBrand() + " is ringing the bell");
    }
}
