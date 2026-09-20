package polymorphic.shapev2;

public class Test {
    public static void main(String[] args) {
        Shape c1 = new Circle("c1", 6);
        Shape c2 = new Circle("c2", 8);
        Shape r = new Rectangle("r", 8, 6);
        Shape t = new Triangle("t", 8, 6);
        String[] Shape = {"c1", "c2", "r", "t"};
        ShapeUtil util = new ShapeUtil();
        util.printAll(new Shape[]{c1, c2, r, t});
        System.out.println(Circle.getCount());
    }
}
