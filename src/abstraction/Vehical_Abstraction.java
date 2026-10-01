/*2. Abstract Class with Constructor

Make an abstract class Vehicle with a constructor that prints "Vehicle created".
Create subclasses Car and Bike that call the superclass constructor.
Check the output order when objects are created.*/
package abstraction;

public class Vehical_Abstraction 
{
	public static void main(String[]args)
	{
		Car c=new Car();
		//c.Car(); you can do this.this give us error
		System.out.println();
		Bike b=new Bike();
	}
}

abstract class Vehical
{
	public Vehical()
	{
		System.out.println("Vehical created");
	}
}

class Car extends Vehical
{
	public Car()
	{
		System.out.println("Car created");
	}
}

class Bike extends Vehical
{
	Bike()
	{
		System.out.println("Bike created");
	}
}