package polymorphic.studentmanager;

public class Admin extends Person {
    public Admin() {
    }

    public Admin(String name, String account, String password) {
        super(name, account, password);
    }

    @Override
    public void work() {
        System.out.println(super.getName() + "'s job is managing WEB");
    }
}
