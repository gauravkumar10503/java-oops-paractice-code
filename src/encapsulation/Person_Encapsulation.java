/*. Basic Encapsulation

Problem: Create a Person class with name and age fields. Use getters and setters to access them.
Next Steps:

Make fields private.

Add public getters and setters.

Test in main method.
Hint: Age should not be negative.*/
package encapsulation;

public class Person_Encapsulation 
{
	public static void main(String[]args)
	{
		Person p=new Person("Gaurav",22);
		p.setage(22);
		p.getname("Gaurav");
		p.setname("Gaurav kumar");
	}
}

class Person 
{
	private String name;
	private int age;
	public Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public int getage(int age)
	{
		return age;
	}
	public void setage(int nage)
	{
		if(age>0)
		{
			System.out.println("Age :- "+(age=nage));
		}
		else
		{
			System.out.println("Enter a valid age");
		}
	}
	public String getname(String name)
	{
		return name;
	}
	public void setname(String nname)
	{
		name=nname;
		System.out.println("Name :- "+nname);
	}
}
