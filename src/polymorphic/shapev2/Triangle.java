package polymorphic.shapev2;

public class Triangle extends Shape {
    private double base;
    private double height;
    private double side3;

    public Triangle() {
    }

    public Triangle(String name, double base, double height, double side3) {
        super(name);
        this.base = base;
        this.height = height;
        this.side3 = side3;
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

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }

    @Override
    public String describe() {
        return "This triangle's base is " + base + " and height is " + height;
    }

    public boolean isRightTriangle() {
        return Math.abs(base * base + height * height - side3 * side3) < 1e-6;
    }
}
