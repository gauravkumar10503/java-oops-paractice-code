//Class Person with name, age, email. Extend Teacher with subject,
//experienceYears.
package inheritance;

public class Teacher_Singlelevel_Inheritance 
{
	public static void main(String[]args)
	{
		Teacher t=new Teacher("Ram",35,"ram@123gmail.com","Maths",7.5);
		t.tinfo();
	}
}

class Persons
{
	public String name;
	public int age;
	public String email;
	public Persons(String name,int age,String email)
	{
		this.name=name;
		this.age=age;
		this.email=email;
	}
	public void pinfo()
	{
		System.out.println("Name :- "+name);
		System.out.println("Age :- "+age+" years");
		System.out.println("Email :- "+email);
	}
}
class Teacher extends Persons
{
	public String sub;
	public double experience;
	public Teacher(String name,int age,String email,String sub,double experience)
	{
		super(name,age,email);
		this.sub=sub;
		this.experience=experience;
	}
	public void tinfo()
	{
		pinfo();
		System.out.println("Subject teacher :- "+sub);
		System.out.println("Years of experience :- "+experience+" years");
	}
}