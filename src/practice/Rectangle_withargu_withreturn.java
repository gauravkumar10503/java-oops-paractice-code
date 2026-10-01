package practice;

public class Rectangle_withargu_withreturn 
{
	public static void main(String[]args)
	{
		area(5.5,7.8);
	}
	public static double area(double a,double b)
	{
		double area=a*b;
		System.out.println("The area of rectangle is :- "+area);
		return area;
	}
}
