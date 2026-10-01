package practice;

public class Sum_Of_Digit 
{
	public static void main(String[]args)
	{
		int n=123;
		int sum=0;
		while(n!=0)
		{
			int last=n%10;
			sum=sum+last;
			n=n/10;
		}
		System.out.println("Sum of digit is :- "+sum);
	}
}
