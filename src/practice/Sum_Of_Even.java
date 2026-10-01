package practice;
import java.util.Scanner;
public class Sum_Of_Even 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your number :- ");
		int x=sc.nextInt();
		sumeven(x);
		sc.close();
	}
	public static void sumeven(int a)
	{
		int sum=0;
		for(int i=2;i<=a;i++)
		{
			if(a%i==0)
			sum=sum+i;
		}
		System.out.println("Sum of even number is :- "+sum);
	}
}
