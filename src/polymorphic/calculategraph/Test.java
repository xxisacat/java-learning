package polymorphic.calculategraph;

public class Test {
    public static void main(String[] args) {
        Graph circle = new Circle(7);
        Graph rectangle = new Rectangle(6, 8);
        Student stu = new Student("Iris", 21);
        stu.learnGraph(circle);
        stu.learnGraph(rectangle);
    }
}
