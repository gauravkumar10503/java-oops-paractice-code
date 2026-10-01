package practice;
import java.util.Scanner;
public class Sum_Method 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter two number one by one :- ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		sum(x,y);
		sc.close();
	}
	public static int sum(int a, int b)
	{
		int sum=a+b;
		System.out.println("Sum of two given number is :- "+sum);
		return sum;
	}
}
