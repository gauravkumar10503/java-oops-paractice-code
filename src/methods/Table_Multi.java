package methods;
import java.util.Scanner;
public class Table_Multi 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your number :- ");
		int n=sc.nextInt();
		table(n);
		sc.close(); 
	}
	public static void table(int x)
	{
		for(int i=1;i<=10;i++)
		{
			int p=x*i;
			System.out.println(x+"X"+i+"="+p);
		}
	}
}
