package practice;
import java.util.Scanner;
public class Tarea 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of height and base :- ");
		double h=sc.nextDouble();
		double b=sc.nextDouble();
		
		double a=(h*b)*1/2;
		
		System.out.println("The area of triangle is :- "+a);
		sc.close();
	}
}
