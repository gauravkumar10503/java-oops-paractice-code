package recursion;


public class Reverse_Of_The_Number 
{
	public static int reverse(int x, int r)
	{
		if(x==0)
		{
			return r;
		}
		return reverse(x/10,r*10+x%10);
	}
	public static void main(String []args)
	{
		int n=1234;
		System.out.print(reverse(n,0));
		
	}
}
