/*17. Abstract Class with Abstract Getter

Create an abstract class Product with an abstract method getPrice().
Subclasses Book and Toy implement their own pricing logic.*/
package abstraction;

public class Abstract_Getter_Abstraction 
{
	public static void main(String[]args)
	{
		
	}
}

abstract class Product
{
	public abstract double getprice();
}

class Book extends Product
{
	public String name;
	public double price;
	public Book(String name,double price)
	{
		this.name=name;
		this.price=price;
	}
	public double getprice()
	{
		return price;
	}
}
