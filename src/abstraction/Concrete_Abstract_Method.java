/*4. Abstract Class with Non-Abstract Methods

Create an abstract class Machine with a concrete method start() and an 
abstract method operate().
Subclasses must override operate() but can reuse start().*/
package abstraction;

public class Concrete_Abstract_Method 
{
	public static void main(String[]args)
	{
		Bikes b=new Bikes();
		b.start();
		System.out.println();
		b.operate();
	}
}

abstract class Machine
{
	public void start()
	{
		System.out.println("Start the Machine");
	}
	public abstract void operate();
}

class Bikes extends Machine
{
	public void start()
	{
		System.out.println("Start the Bike");
	}
	public void operate()
	{
		System.out.println("How to operate the Bike");
		System.out.println("1. Insert the key ");
		System.out.println("2. Push the self buttom");
		System.out.println("3.Change the gear ");
		System.out.println("You're ready to go ");
	}
}


