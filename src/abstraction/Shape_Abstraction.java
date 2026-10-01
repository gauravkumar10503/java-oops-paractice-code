/*1. Basic Abstract Class

Create an abstract class Shape with an abstract method calculateArea().
Then create subclasses Circle and Rectangle that implement this method.
Print the area for each shape.*/
package abstraction;

public class Shape_Abstraction 
{
	public static void main(String[]args)
	{
		Shape s=new Circle(5.5);
		s.calarea();
		
		System.out.println("------------------------------------------------");
		
		Rectangle r=new Rectangle(5,9);
		r.calarea();
	}
}

abstract class Shape
{
	public abstract void calarea();
}

class Circle extends Shape
{
	public double r;
	public Circle(double r)
	{
		this.r=r;
	}
	public void calarea()
	{
		System.out.println("The radius of given circle is :- "+r);
		System.out.println("The area of circle is :- "+(3.14*r*r));
	}
}
class Rectangle extends Shape
{
	public double l;
	public double w;
	public Rectangle(double l,double w)
	{
		this.l=l;
		this.w=w;
	}
	public void calarea()
	{
		System.out.println("The length of given rectangle is :- "+l);
		System.out.println("The width of given rectangle is :- "+w);
		System.out.println("The area of rectangle is :- "+(l*w));
	}
}