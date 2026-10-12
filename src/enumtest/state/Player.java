package enumtest.state;

public class Player {
    private String name;
    private int hp = 100;
    private PlayerState state = PlayerState.IDLE;

    public Player(String name) {
        this.name = name;
    }

    public PlayerState getState() {
        return state;
    }

    public boolean canMove() {
        switch (state) {
            case IDLE, RUNNING -> {
                return true;
            }
            default -> {
                return false;
            }
        }
    }

    public boolean canAttack() {
        switch (state) {
            case IDLE, RUNNING -> {
                return true;
            }
            default -> {
                return false;
            }
        }
    }

    public void attack() {
        if (!canAttack()) {
            System.out.println("Attack failed! Player is " + state);
        } else {
            state = PlayerState.ATTACKING;
            System.out.println("Player is " + state);
        }
    }

    public void hurt(int dmg) {
        if (state == PlayerState.DEAD) {
            System.out.println(name + " has died");
        } else {
            hp -= dmg;
            if (hp <= 0) {
                state = PlayerState.DEAD;
                System.out.println(name + " has died");
            } else {
                state = PlayerState.HURT;
                System.out.println(name + " is hurt");
            }
        }
    }

    public void recover() {
        if (state == PlayerState.HURT) {
            state = PlayerState.IDLE;
            System.out.println(name + " is recovered");
        } else {
            System.out.println("No need to recover now");
        }
    }
}

