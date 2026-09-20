package polymorphic.shapev2;

public class Test {
    public static void main(String[] args) {
        Shape c1 = new Circle("c1", 6);
        Shape c2 = new Circle("c2", 8);
        Shape r = new Rectangle("r", 8, 6);
        Shape t = new Triangle("t", 8, 6, 10);
        Shape[] shapes = {c1, c2, r, t};
        ShapeUtil util = new ShapeUtil();
        util.printAll(shapes);
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Triangle) {
                Triangle triangle = (Triangle) shapes[i];
                if (triangle.isRightTriangle()) {
                    System.out.println(triangle.getName() + " is a right triangle");
                }
            }
        }
        System.out.println(Circle.getCount());
    }
}
