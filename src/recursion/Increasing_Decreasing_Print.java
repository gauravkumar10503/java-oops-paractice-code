package recursion;

import java.util.Scanner;
public class Increasing_Decreasing_Print 
{
	public static void idp(int x)
	{
		if(x==0)
		{
			return;
		}
		System.out.print(x+" ");
		idp(x-1);
		if(x!=1)
		{
			System.out.print(x+" ");
		}
	}
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of n :- ");
		int n=sc.nextInt();
		idp(n);
		sc.close();
	}
}
