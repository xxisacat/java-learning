package polymorphic.calculategraph;

public class Circle extends Graph {
    final double PI = 3.14;
    private double r;

    public Circle() {
    }

    public Circle(int r) {
        this.r = r;
    }

    public double getPI() {
        return PI;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getPerimeter() {
        return 2 * PI * r;
    }

    public double getArea() {
        return PI * r * r;
    }
}
