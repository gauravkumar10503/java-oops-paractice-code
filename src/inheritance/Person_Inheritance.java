//Class Person with name, age, gender. Extend Student with rollNumber, grade.
package inheritance;

public class Person_Inheritance
{
	public static void main(String[]args)
	{
		Student s=new Student("Gaurav",14,"Male",7,"E");
		s.studentinfo();
		
		System.out.println("----------------------------------------------");
		
		s.showinfo();
	}
}

class Person
{
	public String name;
	public int age;
	public String gender;
	public Person(String name,int age,String gender)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	public void showinfo()
	{
		System.out.println("Name :- "+name);
		System.out.println("Age :- "+age);
		System.out.println("Gender :- "+gender);
	}
}
class Student extends Person
{
	public int rollno;
	public String grade;
	public Student(String name,int age,String gender,int rollno,String grade)
	{
		super(name,age,gender);
		this.rollno=rollno;
		this.grade=grade;
	}
	public void studentinfo()
	{
		super.showinfo();
		System.out.println("Roll no :- "+rollno);
		System.out.println("Grade :- "+grade);
	}
}
