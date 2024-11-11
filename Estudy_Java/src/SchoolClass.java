import classes.Person;

import java.util.ArrayList;
import java.util.List;


public class SchoolClass {

    String code;
    Teacher teacher;
    List<Student> students = new ArrayList<Student>();

    public SchoolClass(String code, Teacher teacher) {
        this.code = code;
        this.teacher = teacher;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void removeStudent(String registration) {
        students.removeIf(student -> student.registration == registration);
    }

    public void showClass() {
        System.out.print(
                "codigo da turma: " + code + "\n"
                        + "professro: " + "\n" + "Nome: " + teacher.getName() + ", idade: " + teacher.getage() + ", Email:" + teacher.getemail()
                        + "\n" + "Diciplina: " + teacher.subject + "\n"
        );
        int count = 0;
        while (count < students.size()) {
            printStudent(students.get(count));
            count++;
        }
    }

    private void printStudent(Student student) {
        System.out.println("Aluno:");
        System.out.println(student.showInfo());
        System.out.println("");
    }


}
