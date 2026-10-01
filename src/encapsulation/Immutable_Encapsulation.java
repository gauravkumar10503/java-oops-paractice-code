/*Immutable Class

Description: Create Point class with final x, y.
Next Steps:

No setters.

Only getters and constructor.*/
package encapsulation;

public class Immutable_Encapsulation
{
	public static void main(String[]args)
	{
		Point p=new Point("34.87","23.33");
		System.out.println("X Coordination :- "+p.getx());
		System.out.println("Y-Coordination :- "+p.gety());
	}
}

class Point
{
	private final String x;
	private final String y;
	public Point(String x,String y)
	{
		this.x=x;
		this.y=y;
	}
	public String getx()
	{
		return x;
	}
	public String gety()
	{
		return y;
	}
}
