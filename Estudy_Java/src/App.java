import classes.Person;

public class App {
    public static void main(String[] arg) {
        Teacher teacher = new Teacher(
                "Icaro", "icarolindo@gmail.com", "Matemática", 17
        );
        System.out.println("Professor:"+"\n"+teacher.showInfo());
        Student student = new Student(
                "kevyn", "kevyn.nascimento@aluno.ce.gov.br", "1550", 17, 6
        );
        System.out.println("Alunos: "+"\n"+student.showInfo());
    }

    public static void information() {
        String name = "pokémon";
        String email = "fkevyn692@gmail.com";
        int age = 17;
        Person pokemon = new Person(name, email, age);
        System.out.println(pokemon.showInfo());


    }

}

