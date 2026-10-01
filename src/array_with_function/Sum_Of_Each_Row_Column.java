package array_with_function;

public class Sum_Of_Each_Row_Column 
{
	public static void column(int [][]c)
	{
		for(int i=0;i<=c.length-1;i++)
		{
			int sum=0;
			for(int j=0;j<=c[i].length-1;j++)
			{
				sum+=c[i][j];
			}
			System.out.println("Column :- "+(i+1)+" Sum :- "+sum);
		}
		
	}
	public static void row(int [][]r)
	{
		for(int i=0;i<=r.length-1;i++)
		{
			int add=0;
			for(int j=0;j<=r[i].length-1;j++)
			{
				add+=r[i][j];
			}
			System.out.println("Row :- "+(i+1)+" Sum :- "+add);
		}
		
	}
	public static void main(String []args)
	{
		int [][]a= {{1,2,3},{4,5,6},{7,8,9}};
		row(a);
		System.out.println();
		column(a);
	}
}
