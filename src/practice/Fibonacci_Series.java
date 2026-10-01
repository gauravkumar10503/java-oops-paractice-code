package practice;
import java.util.Scanner;
public class Fibonacci_Series 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("How many terms do you wanna print :- ");
		int n=sc.nextInt();
		
		int a=0;
		int b=1;
		int sum=0;
		for(int i=0;i<=n;i++)
		{
			System.out.print(sum+" ");
			a=b;
			b=sum;
			sum=a+b;
		}
		sc.close();
	}
}
