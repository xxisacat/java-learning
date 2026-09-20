package polymorphic.shapev2;

public abstract class Shape {
    private String name;

    public Shape() {
    }

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double area();

    public abstract String describe();

    public void printInfo() {
        System.out.println("Area is " + area() + " and describe is " + describe());
    }
}
