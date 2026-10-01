package methods;
import java.util.Scanner;
public class Sum_Of_Two_Number 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter two number one by one :- ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		sum(a,b);
		sc.close();
	}
	public static int sum(int x,int y)
	{
		int s=x+y;
		System.out.println("The sum of two given number is :- "+s);
		return s;
	}
}
