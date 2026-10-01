package abstraction;

public class Interface_Ex 
{
	public static void main(String[]args)
	{
		Name n=new Name();
		n.info();
		//Info i=new Info();  you can't make a object for interface
		//but you can access interface's variable from anywhere
		System.out.println("Name :- "+Info.name);
		System.out.println("Age :- "+Info.age);
	}
}

interface Info
{
	String name="Gaurav"; //you've to final all the variable if not compile give you error
	int age=23;
	void info();//here you don't have to write public,its already working as public 

}

class Name implements Info
{
	public void info()
	{
		//you've to implement all interface method in subclass 
		//if you're not implementing interface method-- then your subclass also become abstract method
		System.out.println("Here you're showing infomation");
	}
}