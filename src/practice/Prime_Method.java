package practice;

public class Prime_Method
{
	public static void main(String[]args)
	{
		prime(59);
	}
	
	public static void prime(int a)
	{
		int count=0;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("Given number is  prime");
		}
		else
		{
			System.out.println("Given number is not prime ");
		}
	}
}
