package polymorphic.usevehicle;

public class Person {

    private String name;
    private int age;
    private String gender;

    public Person() {
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void use(Vehicle vehicle) {
        if (vehicle instanceof Bicycle) {
            Bicycle b = (Bicycle) vehicle;
            b.ringBell();
            b.move();
            System.out.println(this.name + " is using " + b.getBrand());
        }
        if (vehicle instanceof Car) {
            Car c = (Car) vehicle;
            c.honk();
            c.move();
            System.out.println(this.name + " is using " + c.getBrand());
        } else {
            System.out.println("Please send a right vehicle");
        }
    }
}
