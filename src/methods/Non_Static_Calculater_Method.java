package methods;
import java.util.Scanner;
public class Non_Static_Calculater_Method 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter two number one by one :- ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		Calculator c=new Calculator();
		c.sum(x, y);
		sc.close();
	}
}

class Calculator
{
	public int sum(int a,int b)
	{
		int s=a+b;
		System.out.print("The sum of two given number is :- "+s);
		return s;
	}
}
