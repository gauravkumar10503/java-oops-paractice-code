package recursion;

import java.util.Scanner;
public class Raise_To_The_Power 
{
	public static int raise(int x,int y)
	{
		if(y==0)
		{
			return 1;
		}
		return x*raise(x,y-1);
	}
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the base and exponet value one by one :- ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int result=raise(a,b);
		System.out.print(a+" raise to the power "+b+" is :-"+result);
		sc.close();
	}
}
