import classes.Person;

public class Teacher extends Person {
    String subject;

    public Teacher(String name, String email, String subject, int age) {
        super(name, email, age);
        this.subject = subject;
    }

    @Override
    public String showInfo() {
        return super.showInfo() + "Materia: " + subject + "\n";
    }
}
