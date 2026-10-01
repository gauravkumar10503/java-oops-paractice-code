/*Vehicle Rental System
Base: Vehicle; Derived: Car, Bike, Truck.
→ What to do next: Implement rental price calculation.*/
package inheritance;

public class Vehical_Rental_Hierarchical_Inheritance 
{
	public static void main(String[]args)
	{
		Cars c=new Cars();
		c.rental(5);
		
		System.out.println("-----------------------------------------------");
		
		Bike b=new Bike();
		b.rental(3);
	}
}
class Vehicle1
{
	public void rental(int day)
	{
		System.out.println("Rental price calculation");
	}
}

class Cars extends Vehicle1
{
	public void rental(int day)
	{
		double r=day*500;
		System.out.println("You rent a car for "+day+" days");
		System.out.println("Car's rent is :- "+r);
	}
}

class Bike extends Vehicle1
{
	public void rental(int day)
	{
		double r=day*200;
		System.out.println("You rent a bike for "+day+" days");
		System.out.println("Bike's rent is :- "+r);
	}
}
class Truck extends Vehicle1
{
	public void rental(int day)
	{
		double r=day*1000;
		System.out.println("You rent a truck for "+day+" days");
		System.out.println("Truck's rent is :- "+r);
	}
}
