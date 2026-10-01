package practice;
import java.util.Scanner;
public class Even_Check 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number :- ");
		int e=sc.nextInt();
		
		if(e%2==0)
		{
			System.out.println("Even number");
		}
		else
		{
			System.out.println("Odd number");
		}
		sc.close();
	}
}
