import classes.Person;

public class App {
    public static void main(String[] arg) {
        Teacher teacher = new Teacher(
                "Icaro", "icarolindo@gmail.com", "Matematica", 17
        );
        System.out.println(teacher.showInfo());
        Student student = new Student(
                "kevyn", "kevyn.nascimento@aluno.ce.gov.br", "1550", 17, 10
        );
        System.out.println(student.showInfo());
    }

    public static void information() {
        String name = "pokémon";
        String email = "fkevyn692@gmail.com";
        int age = 17;
        Person pokemon = new Person(name, email, age);
        System.out.println(pokemon.showInfo());


    }

}

