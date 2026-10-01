/*Online Store Products
Base: Product; Derived: Electronics, Clothing.
→ What to do next: Override getDiscountedPrice().*/
package inheritance;

public class Online_Hierarchical_Inheritance 
{
	public static void main(String[]args)
	{
		Clothing c=new Clothing("Coat",4500);
		c.getdiscount(12.5);
	}
}

 class Product
{
	public String name;
	public double price;
	public Product(String name,double price)
	{
		this.name=name;
		this.price=price;
	}
	public void getdiscount(double b)
	{
		
	}
}

class Electronic extends Product
{
	public Electronic(String name,double price)
	{
		super(name,price);
	}
	public void getdiscount(double d)
	{
		 double l=price-(price*(d/100));
		System.out.println("You buy a "+name+" and you get "+d+" % on electronic");
		System.out.println("You get "+l+" rupees off in "+name);
	}
}

class Clothing extends Product
{
	public Clothing(String name,double price)
	{
		super(name,price);
	}
	public void getdiscount(double d)
	{
		 double l=price-(d/100);
		System.out.println("You buy a "+name+" and you get "+d+" % on clothing");
		System.out.println("You get "+l+" rupees off in "+name);
	}
}