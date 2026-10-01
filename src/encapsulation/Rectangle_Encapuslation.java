/*Encapsulation with Computed Field

Problem: Create a Rectangle class with length and width. Provide a method getArea().
Next Steps:

Keep fields private.

Getter for area only, no setter for area.*/
package encapsulation;

public class Rectangle_Encapuslation 
{
	public static void main(String[]args)
	{
		Rectangle r=new Rectangle(3.3,9.7);
		r.getarea();
	}
}

class Rectangle
{
	private double length;
	private double width;
	public Rectangle(double length,double width)
	{
		this.length=length;
		this.width=width;
	}
	public double getarea()
	{
		double a=length*width;
		System.out.println("The area of rectangle is :- "+a);
		return a;
		
	}
}
