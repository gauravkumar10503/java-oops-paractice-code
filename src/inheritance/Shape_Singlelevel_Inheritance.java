//Class Shape with length, breadth. Extend Rectangle with color, borderWidth.
package inheritance;

public class Shape_Singlelevel_Inheritance 
{
	public static void main(String[]args)
	{
		Rectangle r=new Rectangle(5.5,3.4,"Sliver",1.4);
		r.info();
		r.area();
	}
}

class Shape
{
	public double length;
	public double breath;
	public Shape(double length,double breath)
	{
		this.length=length;
		this.breath=breath;
	}
}

class Rectangle extends Shape
{
	public String color;
	public double borderwidth;
	public Rectangle(double length,double breath,String color,double borderwidth)
	{
		super(length,breath);
		this.color=color;
		this.borderwidth=borderwidth;
	}
	public void info()
	{
		System.out.println("Length :- "+length);
		System.out.println("Breath :- "+breath);
		System.out.println("Color :- "+color);
		System.out.println("Border width :- "+borderwidth);
	}
	public void area()
	{
		double a=length*breath;
		System.out.println("Area of given rectangle is :- "+a);
	}
	
}