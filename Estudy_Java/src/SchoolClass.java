import classes.Person;
import java.util.List;
import java.util.ArrayList;
public class SchoolClass {
    String code;
    Teacher teacher;
    List<Student> alunos;

    public SchoolClass(String code, Teacher teacher) {
        this.teacher = teacher;
        this.code=code;
    }
    public void addStudent(Student student){
        alunos;
    }
    public void showClass() {
        System.out.println("Código da Turma: " + code);
        System.out.println("Professor:"+"\n"+"nome: "+teacher.getName()+", Idade:"+teacher.getage()+", Email: "+teacher.getemail()
        +"\n"+"Matéria: "+teacher.subject+"\n"+"Alunos:"+"\n");
    }
}
