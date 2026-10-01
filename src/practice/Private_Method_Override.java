//Explain what happens if a subclass tries to override a private method.
package practice;

public class Private_Method_Override
{
	public static void main(String[]args)
	{
		Exp5 e=new Exp5("Gaurav","Oracle",9);
		e.info();
		// give us error
	}
}

class Demo5
{
	public String name;
	public String course;
	public Demo5(String name,String course)
	{
		this.name=name;
		this.course=course;
	}
	private void info()
	{
		System.out.println("Name :- "+name);
		System.out.println("Course :- "+course);
	}
}

class Exp5 extends Demo5
{
	public int time;
	public Exp5(String name,String course,int time)
	{
		super(name,course);
		this.time=time;
	}
	public void info()
	{
		info();
		System.out.println("Time :- "+time);
	}
}
