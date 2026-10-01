package practice;
import java.util.Scanner;
public class Reverse_Number2 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your number :- ");
		int n=sc.nextInt();
		
		int r=0;
		while(n!=0)
		{
			int l=n%10;
			r=r*10+l;
			n=n/10;
		}
		System.out.println("The reverse of given number is :- "+r);
		sc.close();
	}
}
