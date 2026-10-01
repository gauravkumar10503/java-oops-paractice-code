package methods;

public class Non_Static_Rectangle
{
	public static void main(String[]args)
	{
		Rectangle r=new Rectangle();
		r.area(5.5, 9.8);
		r.perimeter(3,7.3);
	}
}

class Rectangle
{
	public void area(double l,double b)
	{
		double a=l*b;
		System.out.println("The area of given rectangle is :- "+a);
	}
	public void perimeter(double l,double b)
	{
		double p=2*(l+b);
		System.out.println("The perimeter of given rectangle is :- "+p);
	}
	
}
