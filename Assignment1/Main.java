package Assignment1;

public class Main {

	public static void main(String[] args) {
		Person p=new Person("MustaqAhmed",30,"Male");
		
		String Name=p.getName();
		int Age=p.getAge();
		String Gender=p.getGender();
		
		System.out.println(Name);
		System.out.println(Age);
		System.out.println(Gender);
		
		p.setAge(26);
		
		p.display();
		
		Person p1=new Person("MuhammedMusaib",13);
		p1.display();

	}

}
