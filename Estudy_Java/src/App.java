import classes.Person;

public class App {
    public static void main(String[] arg) {
        Teacher teacher = new Teacher(
                "Icaro", "icarolindo@gmail.com", "Matemática", 17
        );
        //System.out.println("Professor:"+"\n"+teacher.showInfo());
        Student student = new Student(
                "kevyn", "kevyn.nascimento@aluno.ce.gov.br", "1550", 17, 10
        );

        //System.out.println("Alunos: "+"\n"+student.showInfo());
        //System.out.println("Status: "+student.isApprovede());
        SchoolClass schoolClass= new SchoolClass(
                "C-137", teacher
        );
        schoolClass.addStudent(student);
        schoolClass.showClass();
    }

}