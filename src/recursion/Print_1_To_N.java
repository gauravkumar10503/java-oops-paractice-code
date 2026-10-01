package recursion;

import java.util.Scanner;
public class Print_1_To_N 
{
	static int n;
	public static void print(int x)
	{
		if(x>n)
		{
			return;
		}
		System.out.print(x+" ");
		print(x+1);
	}
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of n :- ");
		n=sc.nextInt();
		
		print(1);
		sc.close();
	}
}
