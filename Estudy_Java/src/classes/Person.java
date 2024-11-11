package classes;

public class Person {
    String name;
    String email;
    int age;

    public Person(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }


    public String getName() {
        return name;

    }

    public void setName(String nome) {
        this.name = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getemail() {
        return email;
    }

    public int getage() {
        return age;
    }

    public void setEmail(int age) {
        this.age = age;
    }

    public String showInfo() {
        return "Nome: " + name + ", Email: " + email + ", Idade:" + age + "\n";
    }
}





