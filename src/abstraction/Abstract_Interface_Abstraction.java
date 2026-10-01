/*Abstract Class vs Interface

Create an abstract class Bird with fly() (implemented) and makeSound() (abstract).
Also, create an interface Eatable with method eat().
A class Parrot extends Bird and implements Eatable.*/
package abstraction;

public class Abstract_Interface_Abstraction 
{
	public static void main(String[]args)
	{
		Parrot p=new Parrot();
		p.makesound();
		p.eat();
		p.fly();
	}
}

interface Eatable
{
	void eat();
}

abstract class Bird
{
	public void fly()
	{
		System.out.println("Bird is flying");
	}
	public abstract void makesound();
}

class Parrot extends Bird implements Eatable
{
	public void eat()
	{
		System.out.println("Parrot is eating");
	}
	public void fly()
	{
		System.out.println("Parrot is flying");
	}
	public void makesound()
	{
		System.out.println("Parrot is making a sound");
	}
}
