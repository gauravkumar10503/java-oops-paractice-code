package practice;
import java.util.Scanner;
public class Carea 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of radius :- ");
		double r=sc.nextDouble();
		
		double a=3.14*r*r;
		System.out.println("The area of circle is :- "+a);
		sc.close();
	}
}
