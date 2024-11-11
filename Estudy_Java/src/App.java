
public class App {
    public static void main(String[] arg) {
        Teacher teacher = new Teacher(
                "Marcílio", "marcílio@exemplo.com", "Java", 45
        );
        //System.out.println("Professor:"+"\n"+teacher.showInfo());

        Student student = new Student(
                "Alice", "alice@exemplo.com", "A001", 17, 8.5);
        Student student1 = new Student(
                "Bruno", "bruno@exemplo.com", "A002", 16, 6.0);

        //System.out.println("Alunos: "+"\n"+student.showInfo());
        //System.out.println("Status: "+student.isApprovede());
        SchoolClass schoolClass = new SchoolClass(
                "C-137", teacher
        );
        schoolClass.addStudent(student1);
        schoolClass.addStudent(student);
        schoolClass.showClass();
        System.out.println("----------------------------------");
        schoolClass.removeStudent("A002");
        schoolClass.showClass();
    }

}