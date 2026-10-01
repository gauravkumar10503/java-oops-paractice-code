package methods;
import java.util.Scanner;
public class Palidrome_Number 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your number :- ");
		int x=sc.nextInt();
		pali(x);
		sc.close();
	}
	public static void pali(int n)
	{
		int t=n;
		int r=0;
		while(t!=0)
		{
			int last=t%10;
			r=r*10+last;
			t=t/10;
		}
		System.out.println("The reverse of given number is :- "+r);
		if(n==r)
		{
			System.out.println("Given number is palidrome number ");
		}
		else
		{
			System.out.println("Given number is not a palidrome number ");
		}
	}
}
