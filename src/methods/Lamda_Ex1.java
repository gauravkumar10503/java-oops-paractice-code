package methods;

public class Lamda_Ex1 
{
	public static void main(String []args)
	{
		int x=19;
		int y=10;
		Calculator1 ob=(int a,int b)->
		{
			System.out.println("Sum is :- "+(a+b));
		};
		ob.sum(x, y);
	}
}

interface Calculator1
{
	void sum(int a,int b);
}