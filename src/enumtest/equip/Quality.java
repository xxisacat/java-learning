package enumtest.equip;

public enum Quality {
    COMMON("普通", 1.0) {
        @Override
        public String getColor() {
            return "灰";
        }
    },
    RARE("稀有", 1.5) {
        @Override
        public String getColor() {
            return "蓝";
        }
    },
    EPIC("史诗", 2.2) {
        @Override
        public String getColor() {
            return "金";
        }
    };
    private String rank;
    private double atkRate;

    Quality(String rank, double atkRate) {
        this.rank = rank;
        this.atkRate = atkRate;
    }

    public String getRank() {
        return rank;
    }

    public double getAtkRate() {
        return atkRate;
    }

    public abstract String getColor();
}
