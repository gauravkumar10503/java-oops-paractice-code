/*13. Abstract Class and Polymorphism

Write an abstract class Shape and subclasses Circle, Square, Triangle.
use polymorphism to call calculateArea() on each.*/
package abstraction;

public class Abstract_Polymorphims_Abstraction
{
	public static void main(String[]args)
	{
		Square s=new Square(5.5);
		s.area();
		
		System.out.println("------------------------------------------------");
		
		Circles c=new Circles(4);
		c.area();
		
		System.out.println("-------------------------------------------------");
		
		Triangles t=new Triangles(4,9);
		t.area();
	}
}

abstract class ShapeS
{
	public abstract void area();
}

class Circles extends ShapeS
{
	public double r;
	public Circles(double r)
	{
		this.r=r;
	}
	public void area()
	{
		System.out.println("The radius of given circle is :- "+r);
		System.out.println("The area of circle is :- "+(3.14*r*r));
	}
}
class Triangles extends ShapeS
{
	public double b;
	public double h;
	public Triangles(double b,double h)
	{
		this.b=b;
		this.h=h;
	}
	public void area()
	{
		System.out.println("The base of triangle is :- "+b);
		System.out.println("The height of triangle is :- "+h);
		System.out.println("The area of triangle is :- "+((b*h)*(0.5)));
	}
}
class Square extends ShapeS
{
	public double s;
	public Square(double s)
	{
		this.s=s;
	}
	public void area()
	{
		System.out.println("The side of square is :- "+s);
		System.out.println("The area of square is :- "+(s*s));
	}
}