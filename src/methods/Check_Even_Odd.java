package methods;
import java.util.Scanner;
public class Check_Even_Odd 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your number :- ");
		int n=sc.nextInt();
		check(n);
		sc.close();
	}
	public static void check(int i)
	{
		if(i%2==0)
		{
			System.out.println("Given number is even number ");
		}
		else
		{
			System.out.println("Given number is odd number ");
		}
	}
}
