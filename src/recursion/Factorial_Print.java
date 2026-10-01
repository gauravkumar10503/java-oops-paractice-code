package recursion;

import java.util.Scanner;
public class Factorial_Print 
{
	public static int fact(int x)
	{
		if(x==0 || x==1)
		{
			return 1;
		}
		return x*fact(x-1);
	}
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of n :- ");
		int n=sc.nextInt();
		
		int output=fact(n);
		System.out.print("Factorial of "+n+" is :- "+output);
		sc.close();
	}
}
