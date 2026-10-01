package array_with_function;

public class Snake_2d_Array_Print 
{
	public static void main(String []args)
	{
		int [][]a= {{6,9,2,7,6},{1,3,7,2,9},{9,1,4,5,2}};
		for(int i=0;i<=a.length-1;i++)
		{
			if(i%2==0)
			{
				for(int j=0;j<=a[0].length-1;j++)
				{
					System.out.print(a[i][j]+" ");
				}
			}
			else
			{
				for(int j=a[0].length-1;j>=0;j--)
				{
					System.out.print(a[i][j]+" ");
				}
			}
			System.out.println();
		}
	}
}
