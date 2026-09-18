package oop.synthesize;

public class Undergraduate extends Person {
    private String grade;

    public Undergraduate() {
    }

    public Undergraduate(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void learn() {
        System.out.println(this.getName() + " is learning for a bachelor's degree");
    }
}
