package oop.synthesize;

public class Postgraduate extends Person {
    private String grade;

    public Postgraduate() {
    }

    public Postgraduate(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public void sleep() {
        System.out.println("Owing to the postgraduate's improved accommodation conditions, " + this.getName() + " will rest in the luxurious student dormitory");
    }

    public void learn() {
        System.out.println(this.getName() + " is learning for a master's degree");
    }
}
