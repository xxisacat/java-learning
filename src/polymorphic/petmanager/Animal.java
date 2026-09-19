package polymorphic.petmanager;

public class Animal {
    private int age;
    private String color;
    private String something;

    public Animal() {
    }

    public Animal(int age, String color, String something) {
        this.age = age;
        this.color = color;
        this.something = something;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSomething() {
        return something;
    }

    public void setSomething(String something) {
        this.something = something;
    }

    public void eat(String something) {
        System.out.println("Animal is eating " + something + ".");
    }
}
