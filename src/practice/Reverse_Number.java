package practice;

public class Reverse_Number
{
	public static void main(String[]args)
	{
		int n=123;
		int r=0;
		while(n!=0)
		{
			int last=n%10;
			r=r*10+last;
			n=n/10;
		}
		System.out.println("Reverse number is :- "+r);
	}
}
