/*Write a Java program to create a base class Shape with a method 
called calculateArea(). Create three subclasses: Circle, Rectangle, 
and Triangle. Override the calculateArea() method in each subclass to 
calculate and return the shape's area.*/
package polymorphims;

public class Shape_Area_Polymorphims 
{
	public static void main(String[]args)
	{
		Circle2 c=new Circle2(4.6);
		c.carea();
		
		System.out.println("------------------------------------------------");
		
		Rectangle r=new Rectangle(4.3,5.8);
		r.carea();
		
		System.out.println("-------------------------------------------------");
		
		Triangle t=new Triangle(8,4.2);
		t.carea();
	}
}

class Shapes
{
	public void carea()
	{
		System.out.println("You're calculating area ");
	}
}

class Circle2 extends Shapes
{
	public double r;
	public Circle2(double r)
	{
		this.r=r;
	}
	public void carea()
	{
		System.out.println("The radius of circle is :- "+r);
		System.out.println("The area of cirle is :- "+(3.14*r*r));
	}
}

class Triangle extends Shapes
{
	public double base;
	public double height;
	public Triangle(double base,double height)
	{
		this.base=base;
		this.height=height;
	}
	public void carea()
	{
		System.out.println("The base of triangle is :- "+base);
		System.out.println("The height of triangle is :- "+height);
		System.out.println("The area of triangle is :- "+(base*height*(0.5)));
	}
}

class Rectangle extends Shapes
{
	public double length;
	public double breath;
	public Rectangle(double length,double breath)
	{
		this.length=length;
		this.breath=breath;
	}
	public void carea()
	{
		System.out.println("The length of rectangle is :- "+length);
		System.out.println("The breath of rectangle is :- "+breath);
		System.out.println("The area of rectangle is :- "+(length*breath));
	}
}
