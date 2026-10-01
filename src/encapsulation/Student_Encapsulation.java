/*Student Class

Description: Encapsulate rollNumber and grade.
Next Steps:

Private fields.

Public getters and setters.
Hint: Grade must be A–F only.*/
package encapsulation;

public class Student_Encapsulation 
{
	public static void main(String[]args)
	{
		Student s=new Student(1,"B");
		System.out.println("Grade :- "+s.getgrade());
		
		System.out.println("------------------------------------------------");
		
		s.setgrade("G");
		System.out.println("Grade :- "+s.getgrade());
	}
}

class Student
{
	private int rollno;
	private String grade;
	public Student(int rollno,String grade)
	{
		this.rollno=rollno;
		this.grade=grade;
	}
	public String getgrade()
	{
		return grade;
	}
	public void setgrade(String newgrade)
	{
		
		if(newgrade=="A" || newgrade=="B" || newgrade=="C" || newgrade=="D" || newgrade=="E" || newgrade=="F")
		{
			grade=newgrade;
		}
		else
		{
			System.out.println("Enter a valid grade");
		}
	}
}
