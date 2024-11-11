
public class App {
    public static void main(String[] arg) {
        Teacher teacher = new Teacher(
                "Marcílio", "marcílio@exemplo.com", "Java", 45
        );
        //System.out.println("Professor:"+"\n"+teacher.showInfo());

        Student student = new Student(
                "Alice", "alice@exemplo.com", "A001", 17, 8.5);
        Student student1 = new Student(
                "Adrian", "adrian@exemplo.com", "A002", 15, 7.5);
        Student student2 = new Student(
                "Lidia", "lidia@exemplo.com", "A003", 14, 7);
        Student student3 = new Student(
                "Bruno", "bruno@exemplo.com", "A004", 16, 6.0);

        SchoolClass schoolClass = new SchoolClass(
                "C-137", teacher
        );

        schoolClass.addStudent(student);
        schoolClass.addStudent(student1);
        schoolClass.addStudent(student2);
        schoolClass.addStudent(student3);
        schoolClass.showClass();
        System.out.println("-----------------------------------------------------------"+"\n");
        schoolClass.removeStudent("A00");
        schoolClass.showClass();
    }

}