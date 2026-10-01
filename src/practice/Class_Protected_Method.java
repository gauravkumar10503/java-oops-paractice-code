//Create a method that calls another class’s protected method using inheritance.

package practice;

public class Class_Protected_Method 
{
	public static void main(String[]args)
	{
		Exp9 e= new Exp9("Gaurav",7,"English");
		e.info();
		
		System.out.println("------------------------------------------------");
		
		e.detail();
	}
}

class Demo9
{
	public String name;
	public int roll;
	public Demo9(String name,int roll)
	{
		this.name=name;
		this.roll=roll;
	}
	protected void info()
	{
		System.out.println("Name :- "+name);
		System.out.println("Roll no :- "+roll);
	}
}

class Exp9 extends Demo9
{
	public String sub;
	public Exp9(String name,int roll,String sub)
	{
		super(name,roll);
		this.sub=sub;
	}
	public void detail()
	{
		info();
		System.out.println("Subject :- "+sub);
	}
}