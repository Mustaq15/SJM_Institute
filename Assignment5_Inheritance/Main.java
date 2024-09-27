package Assignment5_Inheritance;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Student student = new Student();
        Teacher teacher = new Teacher();

        //Calling the display() method to check inheritance
        person.display();
        student.display();
        teacher.display();
    }
}