package practice;
import java.util.Scanner;
public class Factorial2 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your value :- ");
		int s=sc.nextInt();
		
		int f=1;
		for(int i=1;i<=s;i++)
		{
			f=f*i;
		}
		System.out.println("The factorial of given number is :- "+f);
		sc.close();
	}
}
