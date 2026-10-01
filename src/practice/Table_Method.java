package practice;
import java.util.Scanner;
public class Table_Method 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your number :- ");
		int x=sc.nextInt();
		table(x);
		sc.close();
	}
	
	public static void table(int a)
	{
		int multi=1;
		for(int i=1;i<=10;i++)
		{
			multi=a*i;
			System.out.println(a+" x "+i+" = "+multi);
		}
	}
}
