import classes.Person;

public class SchoolClass extends Person {
    String code;

    public SchoolClass(String name, String email, String registration, int age, double finalGrade) {
        super(name, email, age);

    }

    @Override
    public String showInfo() {
        return super.showInfo();
    }
}
