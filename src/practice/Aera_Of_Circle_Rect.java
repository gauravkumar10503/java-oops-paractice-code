package practice;
import java.util.Scanner;
public class Aera_Of_Circle_Rect 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the radius value :- ");
		double c=sc.nextDouble();
		System.out.print("Enter the value of length and breath of rectangle :- ");
		double l=sc.nextDouble();
		double b=sc.nextDouble();
		circle(c);
		rectangle(l,b);
		sc.close();
	}
	public static void circle(double r)
	{
		double area=3.14*r*r;
		System.out.println("The area of circle is :- "+area);
	}
	public static void rectangle(double a,double b)
	{
		double area=a*b;
		System.out.println("The area of rectangle is :- "+area);
	}
}
