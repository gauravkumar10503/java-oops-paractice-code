package methods;

public class Non_Static_Student 
{
	public static void main(String[]args)
	{
		Student s=new Student();
	         s.greet();
	}
}

class Student
{
	public void greet()
	{
		System.out.println("Hello");
	}
}
