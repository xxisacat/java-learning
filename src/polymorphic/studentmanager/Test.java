package polymorphic.studentmanager;

public class Test {
    public static void main(String[] args) {
        Person stu = new Student("Iris", "142857xg", "142857");
        stu.work();
        StudentManager sm = new StudentManager();
        sm.register(stu);
        Person tea = new Teacher("Morning", "Good Morning", "999999");
        tea.work();
        sm.register(tea);
        Person admin = new Admin("Binah", "Tuner", "nothing");
        admin.work();
        sm.register(admin);
    }
}
