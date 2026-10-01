package practice;
import java.util.Scanner;
public class Absolute_Value 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a value :- ");
		int a=sc.nextInt();
		
		if(a<0)
		{
			a=a*(-1);
		}
		System.out.println("Your absolute value is :- "+a);
		sc.close();
	}
}
