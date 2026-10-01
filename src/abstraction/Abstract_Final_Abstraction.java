/*12. Abstract Class with Final Method

Create an abstract class Appliance with a final method plugIn() 
and abstract method operate().
Subclasses must implement only operate().*/
package abstraction;

public class Abstract_Final_Abstraction 
{
	public static void main(String[]args)
	{
		Oper o=new Oper();
		o.operates();
		o.plugin();
	}
}

abstract class App
{
	public final void plugin()
	{
		System.out.println("You pluged in ");
	}
	public abstract void operates();
}

class Oper extends App
{
	public void operates()
	{
		System.out.println("You're operating application");
	}
}