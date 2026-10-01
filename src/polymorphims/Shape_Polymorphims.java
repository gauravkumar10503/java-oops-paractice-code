/*Write a Java program to create a base class Shape with methods draw() 
and calculateArea(). Create two subclasses Circle and Cylinder. Override 
the draw() method in each subclass to draw the respective shape. In addition,
override the calculateArea() method in the circle subclass to calculate and
return the area of the circle.*/
package polymorphims;

public class Shape_Polymorphims 
{
	public static void main(String[]args)
	{
		Circle c=new Circle(5.5);
		c.draw();
		c.calculatearea();
		
		System.out.println("------------------------------------------------");
		
		Cylinder s=new Cylinder();
		s.draw();
	}
}

class Shape
{
	public void draw()
	{
		System.out.println("You're drawing something");
	}
	public void calculatearea()
	{
		System.out.println("You're calculating the area ");
	}
}

class Circle extends Shape
{
	public double r;
	public Circle(double r)
	{
		this.r=r;
	}
	public void draw()
	{
		System.out.println("You're drawing circle ");
		System.out.println("Which have "+r+" radius ");
	}
	public void calculatearea()
	{
		System.out.println("You're calculating the area ");
		System.out.println("The are of circle is :- "+(3.14*r*r));
	}
}
class Cylinder extends Shape
{
	public void draw()
	{
		System.out.println("You're drawing the cylinder ");
	}
}