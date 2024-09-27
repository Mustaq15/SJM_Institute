package Assignment5_Inheritance;

public class Teacher extends Person{
    String subject;

    public void display()
    {
        System.out.println(name+"\n"+age+"\n"+subject);
    }
}