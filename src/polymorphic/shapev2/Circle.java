package polymorphic.shapev2;

public class Circle extends Shape {
    private double r;
    private static final double PI = 3.14;
    private static int count;

    public Circle() {
        count++;
    }

    public Circle(String name, double r) {
        super(name);
        this.r = r;
        count++;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return PI * r * r;
    }

    @Override
    public String describe() {
        return "This circle's r is " + r;
    }

    public static int getCount() {
        return count;
    }
}
