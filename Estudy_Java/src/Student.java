import classes.Person;

public class Student extends Person {
    public String registration;
    public double finalGrade;
    public Student(String name, String email, String registration, int age, double finalGrade) {
        super(name, email, age);
        this.registration = registration;
        this.finalGrade = finalGrade;
    }
    public boolean isApprovede(){
        if (finalGrade>=7){
            return true;
        }else{return false;}
    }
    @Override
    public String showInfo() {
        return super.showInfo() + "Matricula: " + registration + ", Nota Final: " + finalGrade ;
    }
}
