import classes.Person;

public class Student extends Person {
    String registration;
    double finalGrade;
    public Student(String name, String email, String registration, int age, double finalGrade) {
        super(name, email, age);
        this.registration = registration;
        this.finalGrade = finalGrade;
    }



    @Override
    public String showInfo() {
        return super.showInfo() + "Matricula: " + registration + ", Nota Final: " + finalGrade +"\n"+"Status: ";
    }
}
