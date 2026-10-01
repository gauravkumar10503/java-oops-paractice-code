/*Vehicle → Car → ElectricCar with brand, speed, color, batteryCapacity, 
chargingTime.*/

package inheritance;

public class Vehical_Multilevel_Inheritance
{
	public static void main(String[]args)
	{
		Ecar c=new Ecar("BMW",120,"Light blue",20,1.5);
		c.ecar();
	}
}

class Vehicle
{
	public String brand;
	public Vehicle(String brand)
	{
		this.brand=brand;
	}
}

class Car extends Vehicle
{
	public int speed;
	public String color;
	public Car(String brand,int speed,String color)
	{
		super(brand);
		this.speed=speed;
		this.color=color;
	}
	public void carinfo()
	{
		System.out.println("Brand's name :- "+brand);
		System.out.println("Speed :- "+speed+" km/h");
		System.out.println("Color :- "+color);
	}
}

class Ecar extends Car
{
	public int bcapecity;
	public double chargingtime;
	public Ecar(String brand,int speed,String color,int bcapecity,double chargingtime)
	{
		super(brand,speed,color);
		this.bcapecity=bcapecity;
		this.chargingtime=chargingtime;
	}
	public void ecar()
	{
		carinfo();
		System.out.println("Battery's capecity :- "+bcapecity+" kwh");
		System.out.println("Charging time :- "+chargingtime+" in hours");
	}
}
