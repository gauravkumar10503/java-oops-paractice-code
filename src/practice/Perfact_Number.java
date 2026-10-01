package practice;
import java.util.Scanner;
public class Perfact_Number 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your number :- ");
		int n=sc.nextInt();
		
		int s=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				s=s+i;
			}
		}
		System.out.println("The sum of given number is :- "+s);
		if(s==n)
		{
			System.out.println("Given number is perfact number");
		}
		else
		{
			System.out.println("Given number is not a perfact number ");
		}
		sc.close();
	}
}
