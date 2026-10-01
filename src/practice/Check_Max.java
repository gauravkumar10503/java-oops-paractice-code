package practice;
import java.util.Scanner;
public class Check_Max
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter two number one by one :- ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		max(x,y);
		sc.close();
	}
	public static void max(int a,int b)
	{
		if(a>b)
		{
			System.out.println("Max of two  number "+a+" and "+b+" is :- "+a);
		}
		else
		{
			System.out.println("Max of two number "+a+" and "+b+" is :- "+b);
		}
	}
}
