package practice;
import java.util.Scanner;
public class Palidrome_Number 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your number :- ");
		int n=sc.nextInt();
		
		int temp=n;
		int r=0;
		while(temp!=0)
		{
			int last=temp%10;
			r=r*10+last;
			temp=temp/10;
		}
		System.out.println("The reverse number is :- "+r);
		
		if(n==r)
		{
			System.out.println("Given number is palidrome number");
		}
		else
		{
			System.out.println("Given numver is not a palidrome number");
		}
		sc.close();
	}
}
