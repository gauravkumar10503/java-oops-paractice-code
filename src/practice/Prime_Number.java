package practice;

public class Prime_Number 
{
	public static void main(String[]args)
	{
		int a=99;
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
			System.out.println("Prime no");
		}
		else
		{
			System.out.println("Not prime no ");
		}
	}
}
