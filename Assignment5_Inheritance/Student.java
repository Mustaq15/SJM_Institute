package Assignment5_Inheritance;

import java.security.spec.RSAOtherPrimeInfo;

public class Student extends Person{
    String grade;

    public void display()
    {
        System.out.println(name+"\n"+age+"\n"+grade);
    }
}