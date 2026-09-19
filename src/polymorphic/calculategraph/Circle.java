package polymorphic.calculategraph;

public class Circle extends Graph {
    private static final double PI = 3.14;
    private double r;

    public Circle() {
    }

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * r;
    }

    @Override
    public double getArea() {
        return PI * r * r;
    }

    @Override
    public String describe() {
        return "This circle's r is " + r;
    }
}
