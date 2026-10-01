package recursion;

import java.util.Scanner;
public class Print_N_To_1 
{
	public static void print(int n)
	{
		if(n==0)
		{
			return;
		}
		System.out.print(n+" ");
		print(n-1);
	}
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of n :- ");
		int n=sc.nextInt();
		print(n);
		sc.close();
	}
}
