package polymorphic.calculategraph;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void learnGraph(Graph graph) {
        if (graph instanceof Circle) {
            System.out.println(this.name + " is learning about a circle.");
            System.out.println("The radius of the circle is " + ((Circle) graph).getR() + ".");
            System.out.println("The perimeter of the circle is " + ((Circle) graph).getPerimeter() + ".");
            System.out.println("The area of the circle is " + ((Circle) graph).getArea() + ".");
        }
        if (graph instanceof Rectangle) {
            System.out.println(this.name + " is learning about a rectangle.");
            System.out.println("The length of the rectangle is " + ((Rectangle) graph).getLength() + ".");
            System.out.println("The width of the rectangle is " + ((Rectangle) graph).getWidth() + ".");
            System.out.println("The perimeter of the rectangle is " + ((Rectangle) graph).getPerimeter() + ".");
            System.out.println("The area of the rectangle is " + ((Rectangle) graph).getArea() + ".");
        }
    }
}
