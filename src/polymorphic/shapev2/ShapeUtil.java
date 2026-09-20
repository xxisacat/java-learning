package polymorphic.shapev2;

public class ShapeUtil {
    public void printAll(Shape[] shapes) {
        for (int i = 0; i < shapes.length; i++) {
            shapes[i].printInfo();
        }
    }
}
