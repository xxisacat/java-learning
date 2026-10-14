package genericity.filter;

public class Gem extends Item {
    private String color;

    public String getColor() {
        return color;
    }

    public Gem(String name, int price, String color) {
        super(name, price);
        this.color = color;
    }
}
