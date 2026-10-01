/*Write a Java program to create a base class Vehicle with methods 
startEngine() and stopEngine(). Create two subclasses Car and Motorcycle.
Override the startEngine() and stopEngine() methods in each subclass to start
and stop the engines differently.*/
package polymorphims;

public class Vehical_Polymorphims 
{
	public static void main(String[]args)
	{
		Car c=new Car();
		c.starte();
		c.stope();
		
		System.out.println("------------------------------------------------");
		
		Motorcycle m=new Motorcycle();
		m.starte();
		m.stope();
	}
}

class Vehical
{
	public void starte()
	{
		System.out.println("Insert the key ");
	}
	public void stope()
	{
		System.out.println("Push the break");
	}
}

class Car extends Vehical
{
	public void starte()
	{
		System.out.println("Insert the key if it not start");
		System.out.println("Use battery to start the car");
	}
	public void stope()
	{
		System.out.println("Breakfail !!!!!");
		System.out.println("Hit on the wall to stop");
	}
}
class Motorcycle extends Vehical
{
	public void starte()
	{
		System.out.println("Insert the key ");
		System.out.println("Then start it by kick ");
	}
	public void stope()
	{
		System.out.println("Push the break if it not working ");
		System.out.println("Then turn off the engine to stop");
	}
}
