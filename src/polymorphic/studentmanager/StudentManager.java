package polymorphic.studentmanager;

public class StudentManager {
    public void register(Person person) {
        System.out.println(person.getName() + " is registered successfully! Account is " + person.getAccount() + " and password is " + person.getPassword());
    }
}
