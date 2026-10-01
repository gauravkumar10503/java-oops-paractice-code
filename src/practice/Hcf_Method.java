package practice;
import java.util.Scanner;
public class Hcf_Method 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter two number one by one :- ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		hcf(x,y);
		sc.close();
	}
	public static void hcf(int a,int b)
	{
		int i;
		int hcf=1;
		for( i=2;i<=a && i<=b;i++)
		{
			if(a%i==0 && b%i==0)
			{
				hcf=hcf*i;
			}
			
		}
		System.out.println("The hcf of given number is :- "+hcf);
		
		int lcm=(a*b)/hcf;
		System.out.println("The lcm of given number is :- "+lcm);
		
	}
}
