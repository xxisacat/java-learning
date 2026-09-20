package polymorphic.shapev2;

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle() {
    }

    public Triangle(String name, double base, double height) {
        super(name);
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }

    @Override
    public String describe() {
        return "This triangle's base is " + base + " and height is " + height;
    }
}
