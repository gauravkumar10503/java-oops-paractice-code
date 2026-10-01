//Show that a protected method is accessible in a subclass in the same package

package practice;

public class Protected_Access_Modifier 
{
	public static void main(String[]args)
	{
		Exp2 e=new Exp2("Gaurav",22,"Ameerpet");
		e.detail();
	}
}

class Demo2
{
	public String name;
	public int age;
	public Demo2(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	protected void info()
	{
		System.out.println("Name :- "+name);
		System.out.println("Age :- "+age);
	}
}

class Exp2 extends Demo2
{
	public String caddress;
	public Exp2(String name,int age,String caddress)
	{
		super(name,age);
		this.caddress=caddress;
	}
	public void detail()
	{
		info();
		System.out.println("Current address :- "+caddress);
	}
}
