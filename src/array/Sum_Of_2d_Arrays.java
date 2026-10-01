package array;

public class Sum_Of_2d_Arrays 
{
	public static void main(String[]args)
	{
		int [][]a= {{1,2,1},{3,2,3},{3,1,2}};
		int [][]b= {{3,1,1},{1,2,1},{3,2,3}};
		int [][]c=new int[3][3];
		
		for(int i=0;i<=c.length-1;i++)
		{
			for(int j=0;j<=c[i].length-1;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("Sum of given two matrices is :- ");
		for(int i=0;i<=c.length-1;i++)
		{
			for(int j=0;j<=c[i].length-1;j++)
			{
				System.out.print(" "+c[i][j]+" ");
			}
			System.out.println();
		}
	}
}
