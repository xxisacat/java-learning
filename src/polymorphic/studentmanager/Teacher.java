package polymorphic.studentmanager;

public class Teacher extends Person {
    public Teacher() {
    }

    public Teacher(String name, String account, String password) {
        super(name, account, password);
    }

    @Override
    public void work() {
        System.out.println(super.getName() + "'s job is teaching");
    }
}
