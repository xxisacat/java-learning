package polymorphic.abstracttest;

public abstract class Animal {
    private String name;
    private int color;

    public Animal() {
    }

    public Animal(String name, int color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public abstract void eat();

    public void drink() {
        System.out.println(this.name + " is drinking");
    }
}
