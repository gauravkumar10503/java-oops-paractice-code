package practice;
import java.util.Scanner;
public class Hcf_Lcm 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter two number to find hcf :- ");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int hcf=1;
		for(int i=1;i<=n&&i<=m;i++)
		{
			if(n%i==0 && m%i==0)
			{
				hcf=hcf*i;
			}
		}
		System.out.println("The hcf of given number is :- "+hcf);
		
		int lcm=(n*m)/hcf;
		System.out.println("The lcm of given number is :- "+lcm);
		sc.close();
	}
}
