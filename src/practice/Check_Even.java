package practice;
import java.util.Scanner;
public class Check_Even 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your number :- ");
		int x=sc.nextInt();
		even(x);
		sc.close();
	}
	public static void even(int a)
	{
		if(a%2==0)
		{
			System.out.println("Your given number "+a+" is even ");
		}
		else
		{
			System.out.println("Your given number "+a+" is odd");
		}
	}
}
