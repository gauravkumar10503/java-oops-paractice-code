/*Write a class with a protected constructor.
Instantiate it using inheritance.*/
package practice;

public class Private_Constructor_Modifier 
{
	public static void main(String[]args)
	{
		Exp4 e=new Exp4("Gaurav","JAVA",11);
		System.out.println("Time :- "+e.time);
	}
}

class Demo4
{
	public String name;
	public String course;
	protected Demo4(String name,String course)
	{
		this.name=name;
		this.course=course;
	}
}

class Exp4 extends Demo4
{
	public int time;
	public Exp4(String name,String course,int time)
	{
		super(name,course);
		this.time=time;
	}
}
