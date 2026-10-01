package practice;
import java.util.Scanner;
public class Lcm 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter two number to find the lcm :- ");
		int s=sc.nextInt();
		int r=sc.nextInt();
		int lcm=1;
		
		for(int i=1;i<=s || i<=r;i++)
		{
			if((s*i)%r==0)
			{
				lcm=s*i;
				System.out.println(" the lcm :- "+lcm);
				break;
			}
		}
		sc.close();
	}
}
