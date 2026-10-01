//Create a class with a public method and call it from another class.

package practice;

public class Public_Access
{
	public static void main(String[]args)
	{
		Detail d=new Detail("Gaurav",22,"Biratpur police chowki no-2");
		d.info();
	}
}

class Detail
{
	public String name;
	public int age;
	public String add;
	public Detail(String name,int age,String add)
	{
		this.name=name;
		this.age=age;
		this.add=add;
	}
	public void info()
	{
		System.out.println("Name :- "+name);
		System.out.println("Age :- "+age);
		System.out.println("Address :- "+add);
	}
}
