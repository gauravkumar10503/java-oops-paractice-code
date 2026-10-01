//Create a public class with a private variable and a public getter/setter.
package practice;

public class Private_Getter_Setter 
{
	public static void main(String[]args)
	{
		Demo6 d=new Demo6("Gaurav","Ameerpet","JAVA");
		d.info();
		
		System.out.println("---------------------------------------------");
		
		d.getcourse();
		d.setcourse("Core java");
		d.info();
	}
}

class Demo6
{
	public String name;
	public String address;
	private String course;
	public Demo6(String name,String address,String course)
	{
		this.name=name;
		this.address=address;
		this.course=course;
	}
	public String getcourse()
	{
		return course;
	}
	public void setcourse(String newcourse)
	{
		this.course=newcourse;
	}
	public void info()
	{
		System.out.println("Name :- "+name);
		System.out.println("Address :-"+address);
		System.out.println("Course :- "+course);
	}
}
