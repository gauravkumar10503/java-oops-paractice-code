//Create a protected method and override it as public.
package practice;

public class Protected_Method_Override 
{
	public static void main(String[]args)
	{
		Exp7 e=new Exp7("Gaurav",7,"Hindi","E");
		e.info();
	}
}

class Demo7
{
	public String name;
	public int roll;
	public String sub;
	public Demo7(String name,int roll,String sub)
	{
		this.name=name;
		this.roll=roll;
		this.sub=sub;
	}
	protected void info()
	{
		System.out.println("Name :- "+name);
		System.out.println("Roll :- "+roll);
		System.out.println("Subject :- "+sub);
	}
}

class Exp7 extends Demo7
{
	public String sec;
	public Exp7(String name,int roll,String sub,String sec)
	{
		super(name,roll,sub);
		this.sec=sec;
	}
	public void info()
	{
		super.info();//you can used super keyword in method also to override
		System.out.println("Section :- "+sec);
	}
}
