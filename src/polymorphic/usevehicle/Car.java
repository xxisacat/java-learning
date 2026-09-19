package polymorphic.usevehicle;

public class Car extends Vehicle {
    public Car() {
    }

    public Car(String brand, double speed) {
        super(brand, speed);
    }

    public void honk() {
        System.out.println(getBrand() + " is honking");
    }
}
