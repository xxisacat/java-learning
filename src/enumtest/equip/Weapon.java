package enumtest.equip;

public class Weapon {
    private String name;
    private int baseAtk;
    private Quality quality;

    public Weapon(String name, int baseAtk, Quality quality) {
        this.name = name;
        this.baseAtk = baseAtk;
        this.quality = quality;
    }

    public Quality getQuality() {
        return quality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBaseAtk() {
        return baseAtk;
    }

    public void setBaseAtk(int baseAtk) {
        this.baseAtk = baseAtk;
    }

    public double realAtk() {
        return baseAtk * quality.getAtkRate();
    }

    public String getColor() {
        return quality.getColor();
    }
}
