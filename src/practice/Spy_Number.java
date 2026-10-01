package practice;
import java.util.Scanner;
public class Spy_Number 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your number :- ");
		int n=sc.nextInt();
		
		int s=0;
		int p=1;
		while(n!=0)
		{
			int l=n%10;
			s=s+l;
			p=p*l;
			n=n/10;
		}
		System.out.println("The sum of number is :- "+s);
		System.out.println("The product of number is :- "+p);
		if(s==p)
		{
			System.out.println("Given number is spy number");
		}
		else
		{
			System.out.println("Given number is not a spy number");
		}
		sc.close();
	}
}
