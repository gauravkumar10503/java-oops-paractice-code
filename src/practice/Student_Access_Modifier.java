/*Write a Java program to demonstrate that a private variable is not 
 * accessible outside its class.
Requirements:
Create a class Student with a private variable marks.
Try to access it from another class Main.
Observe the compile-time error.
Hint:
Use a getter method to access marks safely.*/
package practice;

public class Student_Access_Modifier 
{
	public static void main(String[]arga)
	{
		Student s=new Student("Gaurav",7,10,79);
		//System.out.println("Student's marks :- "+s.marks);
		s.getmarks(79);
		System.out.println("Student's marks :- "+s.getmarks(79));
		
	}
}
class Student
{
	public String name;
	public int rollno;
	public int clasS;
	private int marks;
	public Student(String name,int rollno,int clasS,int marks)
	{
		this.name=name;
		this.rollno=rollno;
		this.clasS=clasS;
		this.marks=marks;
	}
	public int getmarks(int marks)
	{
		return marks;
	}
}

