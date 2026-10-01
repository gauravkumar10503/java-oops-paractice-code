package methods;
import java.util.Scanner;
public class Swap_Number 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter two values one by one :- ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		swap(x,y);
		sc.close();
	}
	public static void swap(int a,int b)
	{
		//a=a+b;
		a=a^b;
		
		//b=a-b;
		b=a^b;
		
		//a=a-b;
		a=a^b;
		
		System.out.println("The value of a is :- "+a);
		System.out.println("The value of b is :- "+b);
	}
}
