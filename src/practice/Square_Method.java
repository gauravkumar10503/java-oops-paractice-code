package practice;
import java.util.Scanner;
public class Square_Method 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your number :- ");
		int x=sc.nextInt();
		square(x);
		sc.close();
	
	}
	public static void square(int a)
	{
		int sq=a*a;
		System.out.println("Square of given number is :- "+sq);
	}
}
