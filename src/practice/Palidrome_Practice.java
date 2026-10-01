package practice;
import java.util.Scanner;
public class Palidrome_Practice 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your number :- ");
		int x=sc.nextInt();
		pali(x);
		sc.close();
	}
	public static void pali(int a)
	{
		int temp=a;
		int reverse=0;
		while(temp!=0)
		{
			int last=temp%10;
			reverse=reverse*10+last;
			temp=temp/10;
		}
		if(reverse==a)
		{
			System.out.println("Given number "+a+" is a palidrome number ");
		}
		else
		{
			System.out.println("Given number "+a+" is not a palidrome number");
		}
	}
}
