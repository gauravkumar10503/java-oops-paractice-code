package practice;

public class Inner_Outer_Private
{
	public static void main(String[]args)
	{
		Exp10 e=new Exp10("Gaurav",7,"Computer");
		e.detail();
	}
}

 class Demo10
{
	public String name;
	public int roll;
	public Demo10(String name,int roll)
	{
		this.name=name;
		this.roll=roll;
	}
	public void detail()
	{
		System.out.println("Name :- "+name);
		System.out.println("Roll no :- "+roll);
	}
}

 class Exp10 extends Demo10
{
	public String sub;
	public Exp10(String name,int roll,String sub)
	{
		super(name,roll);
		this.sub=sub;
	}
	public void detail()
	{
		super.detail();
		System.out.println("Subject :- "+sub);
	}
}