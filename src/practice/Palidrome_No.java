package practice;
import java.util.Scanner;
public class Palidrome_No 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value :- ");
		int n=sc.nextInt();
		
		int t=n;
		int r=0;
		while(t!=0)
		{
			int l=t%10;
			r=r*10+l;
			t=t/10;
		}
		System.out.println("The reverse of given number is :- "+r);
		if(r==n)
		{
			System.out.println("Given number is palidrome number ");
		}
		else
		{
			System.out.println("Given number is not a palidrome number ");
		}
		sc.close();
	}
}
